package io.plenglin.dormled

import javafx.scene.Parent
import tornadofx.View
import tornadofx.borderpane

class MainWindowView : View() {
    override val root: Parent = borderpane {
        top<BluetoothSelectionView>()
        center<LEDControlView>()
    }
}