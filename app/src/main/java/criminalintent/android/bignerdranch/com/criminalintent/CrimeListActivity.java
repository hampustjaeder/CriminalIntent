package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mtr on 6/28/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
