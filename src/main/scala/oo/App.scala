package oo

object App extends App{
  var Philip_Kitchen_holder1_bulb = new Light

  var Android_remote1 = new Invoker(new LighOnCommand(Philip_Kitchen_holder1_bulb), new LightOffCommand(Philip_Kitchen_holder1_bulb),
    new LightTurnUpCommand(Philip_Kitchen_holder1_bulb), new LightDimCommand(Philip_Kitchen_holder1_bulb) )


  Android_remote1.clickOn()
  Android_remote1.clickUp()
  Android_remote1.clickOff()
  Android_remote1.clickDown()




}
