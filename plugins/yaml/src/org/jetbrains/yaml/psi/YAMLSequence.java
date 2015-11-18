package org.jetbrains.yaml.psi;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface YAMLSequence extends YAMLCompoundValue {
  @NotNull
  List<YAMLSequenceItem> getItems();
}
