package com.psdemo.outdoorexplorer.ui.location;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LocationFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LocationFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private LocationFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LocationFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LocationFragmentArgs __result = new LocationFragmentArgs();
    bundle.setClassLoader(LocationFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("locationId")) {
      int locationId;
      locationId = bundle.getInt("locationId");
      __result.arguments.put("locationId", locationId);
    } else {
      __result.arguments.put("locationId", 0);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getLocationId() {
    return (int) arguments.get("locationId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("locationId")) {
      int locationId = (int) arguments.get("locationId");
      __result.putInt("locationId", locationId);
    } else {
      __result.putInt("locationId", 0);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    LocationFragmentArgs that = (LocationFragmentArgs) object;
    if (arguments.containsKey("locationId") != that.arguments.containsKey("locationId")) {
      return false;
    }
    if (getLocationId() != that.getLocationId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getLocationId();
    return result;
  }

  @Override
  public String toString() {
    return "LocationFragmentArgs{"
        + "locationId=" + getLocationId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(LocationFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public LocationFragmentArgs build() {
      LocationFragmentArgs result = new LocationFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setLocationId(int locationId) {
      this.arguments.put("locationId", locationId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getLocationId() {
      return (int) arguments.get("locationId");
    }
  }
}
