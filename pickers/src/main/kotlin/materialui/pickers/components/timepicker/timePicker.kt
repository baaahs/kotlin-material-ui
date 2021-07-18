package materialui.pickers.components.timepicker

import materialui.pickers.components.ExportedClockViewProps
import materialui.pickers.components.WithViewProps
import materialui.pickers.components.internal.desktop.DesktopWrapperProps
import materialui.pickers.components.internal.modal.ModalWrapperProps
import materialui.pickers.components.internal.responsive.ResponsiveWrapperProps
import materialui.pickers.components.internal.static.StaticWrapperProps
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/pickers")
@JsNonModule
private external val TimePickerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val TimePickerComponent: ComponentType<TimePickerProps> = TimePickerModule.TimePicker

external interface TimePickerProps : ExportedClockViewProps, WithViewProps, ResponsiveWrapperProps

fun RBuilder.timePicker(className: String? = null, block: TimePickerElementBuilder.() -> Unit) =
    child(TimePickerElementBuilder(TimePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val MobileTimePickerComponent: ComponentType<MobileTimePickerProps> = TimePickerModule.MobileTimePicker

external interface MobileTimePickerProps : ExportedClockViewProps, WithViewProps, ModalWrapperProps

fun RBuilder.mobileTimePicker(className: String? = null, block: MobileTimePickerElementBuilder.() -> Unit) =
    child(MobileTimePickerElementBuilder(MobileTimePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val DesktopTimePickerComponent: ComponentType<DesktopTimePickerProps> = TimePickerModule.DesktopTimePicker

external interface DesktopTimePickerProps : ExportedClockViewProps, WithViewProps, DesktopWrapperProps

fun RBuilder.desktopTimePicker(className: String? = null, block: DesktopTimePickerElementBuilder.() -> Unit) =
    child(DesktopTimePickerElementBuilder(DesktopTimePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val StaticTimePickerComponent: ComponentType<StaticTimePickerProps> = TimePickerModule.StaticTimePicker

external interface StaticTimePickerProps : ExportedClockViewProps, WithViewProps, StaticWrapperProps

fun RBuilder.staticTimePicker(className: String? = null, block: StaticTimePickerElementBuilder.() -> Unit) =
    child(StaticTimePickerElementBuilder(StaticTimePickerComponent, className).apply(block).create())
