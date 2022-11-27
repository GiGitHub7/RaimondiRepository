clear()
drawStage(ColorMaker.blue)

class Quadrati(x: Int, y: Int) {
val pic = Picture.rectangle(100, 100)
pic.setFillColor(red)
pic.setPosition(x, y)

def draw() {
pic.draw()
}
}



val br = new Quadrati(-100, -100)
br.draw()