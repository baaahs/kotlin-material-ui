package materialui.styles

import kotlinext.js.js
import materialui.rawWithStyles
import materialui.styles.muitheme.MuiTheme
import react.*
import kotlin.reflect.KClass

fun <P: RProps> withStyles(
    functionalComponent: FunctionComponent<P>,
    styleSet: StylesBuilder<P>.() -> Unit,
    withTheme: Boolean = true
): RClass<P> = rawWithStyles(
    { theme: MuiTheme ->  StylesBuilder<P>(theme).apply(styleSet).css },
    js { this["withTheme"] = withTheme }
)(functionalComponent).unsafeCast<RClass<P>>()

fun <P: RProps> withStyles(
    rClass: RClass<P>,
    styleSet: StylesBuilder<P>.() -> Unit,
    withTheme: Boolean = true
): RClass<P> = rawWithStyles(
    { theme: MuiTheme -> StylesBuilder<P>(theme).apply(styleSet).css },
    js { this["withTheme"] = withTheme }
)(rClass).unsafeCast<RClass<P>>()

fun <C : Component<P, *>, P : RProps> withStyles(
    klazz: KClass<C>,
    styleSet: StylesBuilder<P>.() -> Unit,
    withTheme: Boolean = false
): RClass<P> = withStyles(klazz.rClass, styleSet, withTheme = withTheme)

fun <P: RProps> withStyles(
    displayName: String,
    styleSet: StylesBuilder<P>.() -> Unit,
    withTheme: Boolean = false,
    render: RBuilder.(P) -> Unit
): RClass<P> = withStyles(functionalComponent(displayName, render), styleSet, withTheme = withTheme)

@Deprecated(
    "Use withStyles to create a reusable RClass instead, and call that to render the styled component."
)
fun <P : RProps, C : Component<P, *>> RBuilder.childWithStyles(
    klazz: KClass<C>,
    styleSet: StylesBuilder<P>.() -> Unit,
    withTheme: Boolean = false,
    handler: RHandler<P>
): ReactElement {
    val rClass = withStyles(klazz, styleSet, withTheme = withTheme)

    return rClass(handler)
}

@Deprecated(
    "Use withStyles instead",
    replaceWith = ReplaceWith("withStyles(displayName, styleSet, withTheme, render)", "materialui.styles.withStyles")
)
fun <P: RProps> RBuilder.childWithStyles(
    displayName: String,
    styleSet: StylesBuilder<P>.() -> Unit,
    withTheme: Boolean = false,
    render: RBuilder.(P) -> Unit
): RClass<P> = withStyles(functionalComponent(displayName, render), styleSet, withTheme = withTheme)
