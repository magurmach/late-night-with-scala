/**
  * Created by sheikhahmed on 7/3/16.
  */
object Power {
  def pow(base : Long, power: Int, mod: Int): Long = {
    if(power == 0)  1
    else if(power % 2 == 0) {
      val value = pow(base, power/2, mod)
      (value*value)%mod
    } else {
      ((base%mod)*pow(base, power - 1, mod))%mod
    }
  }
}
