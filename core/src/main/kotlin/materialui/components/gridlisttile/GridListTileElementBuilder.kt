package materialui.components.gridlisttile

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.gridlisttile.enums.GridListTitleStyle
import materialui.components.setValue
import react.ComponentType

class GridListTileElementBuilder<T: Tag> internal constructor(
    type: ComponentType<GridListTileProps>,
    classMap: List<Pair<GridListTitleStyle, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, GridListTileProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<GridListTitleStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.cols: Number? by materialProps
    var Tag.rows: Number? by materialProps
}
