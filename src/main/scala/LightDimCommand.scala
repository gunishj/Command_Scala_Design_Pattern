class LightDimCommand(l:Light) extends ICommand {
  override def execute(): Unit = {

    l.Down()
    //in down function generic implementation negative exception already handled.

    print(" Light intensity is :")
    println(l.intensity)

  }
  //haven't used it
  override def unexecute(): Unit = ???

}
