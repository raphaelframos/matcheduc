package powellapps.matcheduc.ui.report

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import powellapps.matcheduc.R
import powellapps.matcheduc.ui.students.StudentsActivity
import powellapps.matcheduc.databinding.AdapterUnitBinding

class UnitAdapter(val units : List<powellapps.matcheduc.model.Unit>) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val binding = AdapterUnitBinding.inflate(LayoutInflater.from(parent.context))
        return UnitViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return units.size
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        holder.bind(units[position])
        holder.itemView.setOnClickListener {
            ContextCompat.startActivity(holder.itemView.context, Intent(holder.itemView.context, StudentsActivity::class.java), null)
        }
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