import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout._
import scalafx.scene.paint._
import scalafx.scene.paint.Color._
import scalafx.scene.text.Text
import scalafx.scene.control._
import scalafx.scene.Node

import immortan.LNParams

object Info {
  def render(): Node =
    new VBox {
      padding = Insets(10, 12, 10, 12)
      children = Seq(
        View(
          "internal pubkey",
          LNParams.secret.keys.ourNodePrivateKey.publicKey.toString
        ),
        View("block height", LNParams.blockCount.get().toString)
      )
    }
}
