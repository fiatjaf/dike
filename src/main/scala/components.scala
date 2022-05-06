import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout._
import scalafx.scene.paint._
import scalafx.scene.paint.Color._
import scalafx.scene.text.Text
import scalafx.scene.control._
import scalafx.scene.Node

object View {
  def apply(key: String, value: String): Node = new HBox {
    children = Seq(
      new Text {
        text = s"$key: "
        style = "-fx-font: normal bold 10pt sans-serif"
      },
      new Text { text = value }
    )
  }
}
