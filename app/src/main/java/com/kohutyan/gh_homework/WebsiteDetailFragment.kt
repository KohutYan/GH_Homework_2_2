package com.kohutyan.gh_homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.kohutyan.gh_homework.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_website_detail.*

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [WebsiteListActivity]
 * in two-pane mode (on tablets) or a [WebsiteDetailActivity]
 * on handsets.
 */
class WebsiteDetailFragment : Fragment() {

    companion object {
        val ARG_ITEM_ID = "1"
    }
    /**
     * The dummy content this fragment is presenting.
     */
    private var mItem: DummyContent.DummyItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (arguments?.containsKey(ARG_ITEM_ID)!!) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP[arguments?.getString(ARG_ITEM_ID)]
            mItem?.let {
                activity?.toolbar_layout?.title = it.website_name
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.website_detail, container, false)

        mItem?.let {
            val webView: WebView = rootView.findViewById(R.id.website_detail)

            webView.webViewClient = WebViewClient()
            webView.settings.javaScriptEnabled = true
            webView.loadUrl(mItem?.website_url)
        }

        return rootView
    }
}