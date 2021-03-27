package oo

class Invoker(on:ICommand,off:ICommand,up:ICommand,down:ICommand) {
  def clickOn():Unit= {
  on.execute()
}
 def clickOff():Unit={
    off.execute()
  }
  def clickUp():Unit={
    up.execute()
  }
  def clickDown():Unit={
    down.execute()
  }
}
