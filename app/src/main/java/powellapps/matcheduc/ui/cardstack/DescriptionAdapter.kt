package powellapps.matcheduc.ui.cardstack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_description.view.*
import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.AdapterDescriptionBinding
import java.util.*

class DescriptionAdapter(val descriptions : List<String>) : RecyclerView.Adapter<DescriptionAdapter.DescriptionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DescriptionViewHolder {
        var binding = AdapterDescriptionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DescriptionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return descriptions.size
    }

    override fun onBindViewHolder(holder: DescriptionViewHolder, position: Int) {
        holder.bind(descriptions[position])
    }

    class DescriptionViewHolder(val binding: AdapterDescriptionBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(name: String) {
            with(binding){
                this.textViewName.text = name
                this.textViewName.setBackgroundColor(ContextCompat.getColor(binding.root.context, suffleColor()))
            }
        }

        private fun suffleColor(): Int {
            val colors = Arrays.asList(R.color.color_1, R.color.color_2, R.color.color_3, R.color.color_4, R.color.color_5, R.color.color_6)
            val position = (0..(colors.size-1)).random()
            return colors[position]
        }


    }
}