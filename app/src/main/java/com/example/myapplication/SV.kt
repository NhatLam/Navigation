package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

class SV(var name: String?, var tuoi:Int) : Parcelable {
  override fun describeContents(): Int {
   TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  constructor(parcel: Parcel) : this(
   parcel.readString(),
   parcel.readInt()
  )
  override fun writeToParcel(p0: Parcel?, p1: Int) {
   p0?.writeString(name)
   p0?.writeInt(tuoi)
  }


  companion object CREATOR : Parcelable.Creator<SV> {
   override fun createFromParcel(parcel: Parcel): SV {
    return SV(parcel)
   }

   override fun newArray(size: Int): Array<SV?> {
    return arrayOfNulls(size)
   }
  }

 }