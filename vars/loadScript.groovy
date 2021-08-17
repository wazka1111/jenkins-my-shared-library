def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/script/${config.name}"
  writeFile file: "${config.name}", text: scriptcontents 
  bat " ./${config.name}"
} 
