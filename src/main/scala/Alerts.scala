import scalafx.stage.Window
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType

import fr.acinq.eclair.transactions.RemoteFulfill
import immortan.fsm.{OutgoingPaymentSenderData, IncomingRevealed}

import Main.stage

object Alerts {
  def paymentSent(
      data: OutgoingPaymentSenderData,
      fulfill: RemoteFulfill
  ): Unit =
    new Alert(AlertType.Information) {
      initOwner(stage)
      title = "Information Dialog"
      headerText = "Look, an Information Dialog."
      contentText = "I have a great message for you!"
    }.showAndWait()

  def paymentFailed(data: OutgoingPaymentSenderData): Unit =
    new Alert(AlertType.Information) {
      initOwner(stage)
      title = "Information Dialog"
      headerText = "Look, an Information Dialog."
      contentText = "I have a great message for you!"
    }.showAndWait()

  def paymentReceived(r: IncomingRevealed): Unit =
    new Alert(AlertType.Information) {
      initOwner(stage)
      title = "Information Dialog"
      headerText = "Look, an Information Dialog."
      contentText = "I have a great message for you!"
    }.showAndWait()
}
