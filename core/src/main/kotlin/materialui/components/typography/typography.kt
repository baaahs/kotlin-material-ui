package materialui.components.typography

import kotlinx.html.*
import materialui.components.StandardProps
import materialui.components.typography.enums.TypographyStyle
import materialui.components.typography.enums.TypographyVariant
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Typography")
private external val typographyModule: dynamic

external interface TypographyProps : StandardProps {
    var align: String?
    var color: String?
    var display: String?
    var gutterBottom: Boolean?
    var noWrap: Boolean?
    var paragraph: Boolean?
    var variant: String?
    var variantMapping: VariantMapping?
}

external interface VariantMapping {
    var h1: String?
    var h2: String?
    var h3: String?
    var h4: String?
    var h5: String?
    var h6: String?
    var subtitle1: String?
    var subtitle2: String?
    var body1: String?
    var body2: String?
}

@Suppress("UnsafeCastFromDynamic")
private val typographyComponent: RClass<TypographyProps> = typographyModule.default

fun RBuilder.typography(vararg classMap: Pair<TypographyStyle, String>, block: TypographyElementBuilder<SPAN, TypographyProps>.() -> Unit)
    = child(TypographyElementBuilder(typographyComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun RBuilder.typography(vararg classMap: Pair<TypographyStyle, String>, p: Boolean, block: TypographyElementBuilder<P, TypographyProps>.() -> Unit)
    = child(TypographyElementBuilder(typographyComponent, classMap.toList()) { P(mapOf(), it) }.apply {
        attrs.paragraph = p
        block()
    }.create())

fun <T: Tag> RBuilder.typography(vararg classMap: Pair<TypographyStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TypographyElementBuilder<T, TypographyProps>.() -> Unit)
     = child(TypographyElementBuilder(typographyComponent, classMap.toList(), factory).apply(block).create())

inline fun RBuilder.typographyH1(vararg classMap: Pair<TypographyStyle, String>, crossinline block: TypographyElementBuilder<H1, TypographyProps>.() -> Unit)
    = typography(*classMap, factory = { H1(mapOf(), it) }) {
        attrs.variant = TypographyVariant.h1
        block()
    }
inline fun RBuilder.typographyH2(vararg classMap: Pair<TypographyStyle, String>, crossinline block: TypographyElementBuilder<H2, TypographyProps>.() -> Unit)
    = typography(*classMap, factory = { H2(mapOf(), it) }) {
        attrs.variant = TypographyVariant.h2
        block()
    }
inline fun RBuilder.typographyH3(vararg classMap: Pair<TypographyStyle, String>, crossinline block: TypographyElementBuilder<H3, TypographyProps>.() -> Unit)
    = typography(*classMap, factory = { H3(mapOf(), it) }) {
        attrs.variant = TypographyVariant.h3
        block()
    }
inline fun RBuilder.typographyH4(vararg classMap: Pair<TypographyStyle, String>, crossinline block: TypographyElementBuilder<H4, TypographyProps>.() -> Unit)
    = typography(*classMap, factory = { H4(mapOf(), it) }) {
        attrs.variant = TypographyVariant.h4
        block()
    }
inline fun RBuilder.typographyH5(vararg classMap: Pair<TypographyStyle, String>, crossinline block: TypographyElementBuilder<H5, TypographyProps>.() -> Unit)
    = typography(*classMap, factory = { H5(mapOf(), it) }) {
        attrs.variant = TypographyVariant.h5
        block()
    }
inline fun RBuilder.typographyH6(vararg classMap: Pair<TypographyStyle, String>, crossinline block: TypographyElementBuilder<H6, TypographyProps>.() -> Unit)
    = typography(*classMap, factory = { H6(mapOf(), it) }) {
        attrs.variant = TypographyVariant.h6
        block()
    }
