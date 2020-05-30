package materialui.components.zoom

import materialui.Zoom
import materialui.reacttransiton.RTransitionProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RProps

external interface ZoomProps : RTransitionProps, RProps {
    var style: Any?
    var theme: MuiTheme?
}

fun RBuilder.zoom(block: ZoomElementBuilder.() -> Unit)
    = child(ZoomElementBuilder(Zoom).apply(block).create())
