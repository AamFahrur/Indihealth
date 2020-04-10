package inn.mroyek.halodokter.view.auth.forgot

import inn.mroyek.halodokter.R
import inn.mroyek.halodokter.base.AmActivity
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity : AmActivity(R.layout.activity_forgot_password), ForgotPasswordContract.View {
    override var presenter: ForgotPasswordContract.Presenter? = ForgotPasswordPresenter(this, this)

    override fun initView() {
        initToolbar(pageName = getString(R.string.title_forgot_password), back = true)
    }

    override fun initListener() {
        super.initListener()

        buttonReset.setOnClickListener {
            presenter?.resetPassword(inputEmailAddress.text.toString())
        }
    }

    override fun clearForm() {
        inputEmailAddress.setText("")
    }


}