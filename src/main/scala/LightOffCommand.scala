class LightOffCommand(l:Light) extends ICommand {
  override def execute(): Unit = {
    l.Off()

    print(" Light Status is Switched - ")
    println(l.status)
  }

  //haven't used it
  override def unexecute(): Unit = ???

}
