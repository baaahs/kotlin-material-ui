package materialui.components.dialogactions

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.dialogactions.enums.DialogActionsStyle
import materialui.components.getValue
import materialui.components.setValue
import react.ComponentType

class DialogActionsElementBuilder internal constructor(
    type: ComponentType<DialogActionsProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, DialogActionsProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<DialogActionsStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableSpacing: Boolean? by materialProps
}
