package com.payroll.payroll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class DashboardFragment extends Fragment {

    public DashboardFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // Initialize CardViews
        CardView cardPayslips = view.findViewById(R.id.payslips_cardview);
        CardView cardAttendance = view.findViewById(R.id.attendance_cardview);
        CardView cardLeave = view.findViewById(R.id.leave_cardview);
        CardView cardSupport = view.findViewById(R.id.support_cardview);

        // Set click listeners to open other fragments
        cardPayslips.setOnClickListener(v -> openFragment(new PayslipsFragment()));
        cardAttendance.setOnClickListener(v -> openFragment(new AttendanceFragment()));
        cardLeave.setOnClickListener(v -> openFragment(new LeaveFragment()));
        cardSupport.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Support feature coming soon!", Toast.LENGTH_SHORT).show();
    });

        return view;
    }

    private void openFragment(Fragment fragment) {
        if (getActivity() != null) {
            FragmentTransaction transaction = getActivity()
                    .getSupportFragmentManager()
                    .beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.addToBackStack(null); // allows going back to dashboard
            transaction.commit();
        }
    }
}
