package post

class Box3 : Box() {

    companion object {
        @JvmStatic
        var boxLength: Float = 23f
        var boxWidth: Float = 14f
        var boxHeight: Int = 13
    }

    override fun validate(length: Float, width: Float, height: Int): Boolean =
        !(boxLength < length || boxWidth < width || boxHeight < height)
}