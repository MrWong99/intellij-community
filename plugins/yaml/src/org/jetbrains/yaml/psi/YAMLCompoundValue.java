package org.jetbrains.yaml.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

/**
 * @author oleg
 */
public interface YAMLCompoundValue extends YAMLPsiElement {
  @Nullable
  PsiElement getTag();
}