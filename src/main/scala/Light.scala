class Light {

  var status:String="Off"
  var intensity:Int=1

  def On():Unit = {
    this.status = "On"
  }

  def Off():Unit = {
    this.status = "Off"
  }

  def Up():Unit = {
    this.intensity += 1
  }

  def Down():Unit= {
    if(this.intensity > 1){
    this.intensity -= 1
    }
    else {
      this.intensity = 0
    }
  }

}
