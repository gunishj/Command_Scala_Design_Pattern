trait ICommand {
  def execute(): Unit
  def unexecute():Unit
}
