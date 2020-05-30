package materialui.components.rootref

import materialui.RootRef
import react.*

external interface RootRefProps : RProps {
    var rootRef: RRef?
}

fun RBuilder.rootRef(block: RootRefElementBuilder.() -> Unit)
    = child(RootRefElementBuilder(RootRef).apply(block).create())
