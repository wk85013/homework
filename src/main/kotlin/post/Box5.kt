package post

class Box5: Box() {
    companion object {
        @JvmStatic
        var boxLength: Float = 39.5f
        var boxWidth: Float = 27.5f
        var boxHeight: Int = 23
    }

    override fun validate(length: Float, width: Float, height: Int): Boolean =
        !(boxLength < length || boxWidth < width || boxHeight < height)
}