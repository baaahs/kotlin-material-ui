package components.popover

import components.enums.AnchorReference
import components.modal.ModalElementBuilder
import kotlinx.html.Tag
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import values.AnchorOrigin
import values.AnchorPosition
import values.TransformOrigin
import values.TransitionDuration

open class PopoverElementBuilder(
    type: RComponent<RProps, RState>
) : ModalElementBuilder(type) {

    var Tag.action: (Any) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["action"]
        set(value) { setProp("action", value) }
    var Tag.anchorEl: ReactElement?
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchorEl"]
        set(value) { setProp("anchorEl", value) }
    var Tag.anchorOrigin: AnchorOrigin
        get() = AnchorOrigin(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchorOrigin"])
        set(value) { setProp("anchorOrigin", value.value) }
    var Tag.anchorPosition: AnchorPosition
        get() = AnchorPosition(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchorPosition"])
        set(value) { setProp("anchorPosition", value.value) }
    var Tag.anchorReference: AnchorReference
        get() = AnchorReference.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchorReference"])
        set(value) { setProp("anchorReference", value.toString()) }
    var Tag.elevation: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["elevation"]
        set(value) { setProp("elevation", value) }
    var Tag.getContentAnchorEl: (HTMLElement) -> HTMLElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["getContentAnchorEl"]
        set(value) { setProp("getContentAnchorEl", value) }
    var Tag.marginThreshold: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["marginThreshold"]
        set(value) { setProp("marginThreshold", value) }
    var Tag.modalClasses: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["ModalClasses"]
        set(value) { setProp("ModalClasses", value) }
    var Tag.onEnter: (Node) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEnter"]
        set(value) { setProp("onEnter", value) }
    var Tag.onEntered: (Node) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntered"]
        set(value) { setProp("onEntered", value) }
    var Tag.onEntering: (Node) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntering"]
        set(value) { setProp("onEntering", value) }
    var Tag.onExit: (Node) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExit"]
        set(value) { setProp("onExit", value) }
    var Tag.onExited: (Node) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExited"]
        set(value) { setProp("onExited", value) }
    var Tag.onExiting: (Node) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExiting"]
        set(value) { setProp("onExiting", value) }
    var Tag.paperProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PaperProps"]
        set(value) { setProp("PaperProps", value) }
    var Tag.role: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["role"]
        set(value) { setProp("role", value) }
    var Tag.transformOrigin: TransformOrigin
        get() = TransformOrigin(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["transformOrigin"])
        set(value) { setProp("transformOrigin", value.value) }
    var Tag.transitionComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionComponent"]
        set(value) { setProp("TransitionComponent", value) }
    var Tag.transitionDuration: TransitionDuration
        get() = TransitionDuration.fromDynamic(props.asDynamic()["transitionDuration"])
        set(value) { setProp("transitionDuration", value.value) }
    var Tag.transitionProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionProps"]
        set(value) { setProp("TransitionProps", value) }
}