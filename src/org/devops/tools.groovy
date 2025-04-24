package org.devops

def PrintMes(content){
  println(content)
}

//格式化输出
def PrintMes(value, color){
  def colors = ['red' : "\033[40;31m >>>>>>>>>>>${value} <<<<<<<<<<<< \033[0m", 
           'blue' : "\033[47;34m ${value} \033[0m"]
  ansiColor('xterm'){
    println(colors[color])
  }
}
