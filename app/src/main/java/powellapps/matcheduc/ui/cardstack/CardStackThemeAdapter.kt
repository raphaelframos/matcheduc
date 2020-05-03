package powellapps.matcheduc.ui.cardstack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import powellapps.matcheduc.databinding.AdapterCardstackthemeBinding
import powellapps.matcheduc.model.Theme

class CardStackThemeAdapter(var themes: List<Theme>) : RecyclerView.Adapter<CardStackThemeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = AdapterCardstackthemeBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return themes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(themes.get(position))

    inner class ViewHolder(val binding: AdapterCardstackthemeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(theme: Theme) {
            with(binding){
                this.textViewName.text = theme.name
            }

        }

    }

}
