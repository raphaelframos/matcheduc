package powellapps.matcheduc.ui.report

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.AdapterUnitBinding

class UnitAdapter(val units : List<powellapps.matcheduc.model.Unit>) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val binding = AdapterUnitBinding.inflate(LayoutInflater.from(parent.context))
        return UnitViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  if(units != null) units.size else 0
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        holder.bind(units[position])
    }

    class UnitViewHolder(val binding : AdapterUnitBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(unit: powellapps.matcheduc.model.Unit) {
            binding.textViewAmountStudents.text = unit.amountStudents.toString() + " " + binding.root.context.getString(
                            R.string.alunos)
            binding.textViewClass.text = unit.classroom
            binding.textViewUnitName.text = unit.name
        }

    }
}