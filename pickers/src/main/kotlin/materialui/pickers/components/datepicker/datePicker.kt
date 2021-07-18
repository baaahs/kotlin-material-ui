package materialui.pickers.components.datepicker

import materialui.pickers.components.ExportedCalendarViewProps
import materialui.pickers.components.WithViewProps
import materialui.pickers.components.internal.desktop.DesktopWrapperProps
import materialui.pickers.components.internal.modal.ModalWrapperProps
import materialui.pickers.components.internal.responsive.ResponsiveWrapperProps
import materialui.pickers.components.internal.static.StaticWrapperProps
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/pickers")
@JsNonModule
private external val DatePickerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val DatePickerComponent: ComponentType<DatePickerProps> = DatePickerModule.DatePicker

external interface DatePickerProps : ExportedCalendarViewProps, WithViewProps, ResponsiveWrapperProps

fun RBuilder.datePicker(className: String? = null, block: DatePickerElementBuilder.() -> Unit) =
    child(DatePickerElementBuilder(DatePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val MobileDatePickerComponent: ComponentType<MobileDatePickerProps> = DatePickerModule.MobileDatePicker

external interface MobileDatePickerProps : ExportedCalendarViewProps, WithViewProps, ModalWrapperProps

fun RBuilder.mobileDatePicker(className: String? = null, block: MobileDatePickerElementBuilder.() -> Unit) =
    child(MobileDatePickerElementBuilder(MobileDatePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val DesktopDatePickerComponent: ComponentType<DesktopDatePickerProps> = DatePickerModule.DesktopDatePicker

external interface DesktopDatePickerProps : ExportedCalendarViewProps, WithViewProps, DesktopWrapperProps

fun RBuilder.desktopDatePicker(className: String? = null, block: DesktopDatePickerElementBuilder.() -> Unit) =
    child(DesktopDatePickerElementBuilder(DesktopDatePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val StaticDatePickerComponent: ComponentType<StaticDatePickerProps> = DatePickerModule.StaticDatePicker

external interface StaticDatePickerProps : ExportedCalendarViewProps, WithViewProps, StaticWrapperProps

fun RBuilder.staticDatePicker(className: String? = null, block: StaticDatePickerElementBuilder.() -> Unit) =
    child(StaticDatePickerElementBuilder(StaticDatePickerComponent, className).apply(block).create())

