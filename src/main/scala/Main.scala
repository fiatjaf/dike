import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout._
import scalafx.scene.paint._
import scalafx.scene.paint.Color._
import scalafx.scene.text.Text
import scalafx.scene.control._

object Main extends JFXApp3 {
  override def start(): Unit = {
    Setup()

    stage = new JFXApp3.PrimaryStage {
      title = "dike"
      scene = new Scene {
        fill = Color.rgb(254, 254, 254)
        content = new VBox {
          padding = Insets(10, 12, 10, 12)
          children = Seq(
            new HBox {
              padding = Insets(10, 12, 10, 12)
              children = Seq(
                new Text {
                  text = "dike"
                  style = "-fx-font: normal bold 30pt sans-serif"
                  fill = Color.GreenYellow
                }
              )
            },
            Info.render()
          )
        }
      }
    }
  }
}
