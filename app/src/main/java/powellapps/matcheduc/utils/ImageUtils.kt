package powellapps.matcheduc.utils

import android.widget.ImageView
import coil.api.load
import coil.transform.CircleCropTransformation
import powellapps.matcheduc.R

class ImageUtils {

    companion object{

        fun showImageCircle(imageView : ImageView, url: String){
            imageView.load(url) {
                crossfade(true)
                placeholder(R.drawable.ic_home_black_24dp)
                transformations(CircleCropTransformation())
            }
        }
    }
}