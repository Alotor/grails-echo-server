class EchoController {
    public echo() {
        int width = 60
        println "=" * width
        println "= REQUEST BODY ${' ' * (width-16)}="
        println "=" * width
        println "${request.inputStream.text}"
        println "=" * width
        render "OK"
    }
}