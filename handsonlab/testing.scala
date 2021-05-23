package handsonlab

class car1(name:String,Type:String,Brand:String,Launchyear:Int) {
  def apply(): Unit = {
    println(s"Name is $name,Type is $Type,brand is $Brand,Launchyear is $Launchyear");
  }
}

object testing extends App{
  var ob1=new car1("Hondacity","Petrol","Honda",2005);
  ob1.apply();
}
