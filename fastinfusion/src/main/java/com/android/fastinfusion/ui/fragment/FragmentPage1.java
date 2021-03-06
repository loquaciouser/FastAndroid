/*
 * Copyright (C) 2014 loQua.Xee <loquaciouser@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.fastinfusion.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.fastinfusion.R;
import com.android.fastlibrary.ui.fragment.BaseFragment;

public class FragmentPage1 extends BaseFragment {

  private View rootView;//缓存Fragment view

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("AAAAAAAAAA____onCreate");
  }

  //@Override
  //public View onCreateView(LayoutInflater inflater, ViewGroup container,
  //    Bundle savedInstanceState) {
  //
  //  //return inflater.inflate(R.layout.fragment_1, container, false);
  //
  //  if (rootView == null) {
  //    rootView = inflater.inflate(R.layout.fragment_1, null);
  //    System.out.println("AAAAAAAAAA____onCreateView");
  //  }
  //  //缓存的rootView需要判断是否已经被加过parent， 如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误。
  //  ViewGroup parent = (ViewGroup) rootView.getParent();
  //  if (parent != null) {
  //    parent.removeView(rootView);
  //  }
  //  return rootView;
  //}

  @Override protected View setRootView(LayoutInflater inflater, ViewGroup container,
      Bundle bundle) {
    return inflater.inflate(R.layout.fragment_1, null);
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    System.out.println("AAAAAAAAAA____onActivityCreated");
  }

  @Override
  public void onStart() {
    super.onStart();
    System.out.println("AAAAAAAAAA____onStart");
  }

  @Override
  public void onResume() {
    super.onResume();
    System.out.println("AAAAAAAAAA____onResume");
  }

  @Override
  public void onPause() {
    super.onPause();
    System.out.println("AAAAAAAAAA____onPause");
  }

  @Override
  public void onStop() {
    super.onStop();
    System.out.println("AAAAAAAAAA____onStop");
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    System.out.println("AAAAAAAAAA____onDestroyView");
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    System.out.println("AAAAAAAAAA____onDestroy");
  }

  @Override
  public void onDetach() {
    super.onDetach();
    System.out.println("AAAAAAAAAA____onDetach");
  }
}
