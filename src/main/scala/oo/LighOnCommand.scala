package oo

class LighOnCommand(l:Light) extends ICommand {
  override def execute(): Unit = {
    l.On()
    print(" oo.Light Status is Switched - ")
    println(l.status)

  }

  //haven't used it
  override def unexecute(): Unit = {
    l.Off()
  }

}
