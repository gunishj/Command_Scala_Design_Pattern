class LightTurnUpCommand(l:Light) extends ICommand {
  override def execute(): Unit = {

    l.Up()

    print(" Light intensity is :")
    println(l.intensity)
  }

  //haven't used it
  override def unexecute(): Unit = ???

}
