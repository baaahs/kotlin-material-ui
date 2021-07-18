package materialui.components.iconbutton

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.button.enums.ButtonColor
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.iconbutton.enums.IconButtonEdge
import materialui.components.iconbutton.enums.IconButtonStyle
import materialui.components.setValue
import react.ComponentType

class IconButtonElementBuilder<T: Tag>(
    type: ComponentType<IconButtonProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, IconButtonProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<IconButtonStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.color: ButtonColor? by materialProps
    var Tag.edge: IconButtonEdge? by materialProps
}
