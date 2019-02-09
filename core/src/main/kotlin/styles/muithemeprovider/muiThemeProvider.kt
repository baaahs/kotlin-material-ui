package styles.muithemeprovider

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/styles/MuiThemeProvider")
private external val muiThemeProviderModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val muiThemeProviderComponent: RComponent<RProps, RState> = muiThemeProviderModule.default

fun RBuilder.muiThemeProvider(block: MuiThemeProviderBuilder.() -> Unit)
    = child(MuiThemeProviderBuilder(muiThemeProviderComponent).apply(block).create())
