package org.jetbrains.yaml.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.yaml.YAMLTokenTypes;
import org.jetbrains.yaml.psi.YAMLCompoundValue;

/**
 * @author oleg
 */
public class YAMLCompoundValueImpl extends YAMLPsiElementImpl implements YAMLCompoundValue {
  public YAMLCompoundValueImpl(@NotNull final ASTNode node) {
    super(node);
  }

  @Nullable
  @Override
  public PsiElement getTag() {
    final PsiElement firstChild = getFirstChild();
    if (firstChild.getNode().getElementType() == YAMLTokenTypes.TAG) {
      return firstChild;
    }
    else {
      return null;
    }
  }

  @Override
  public String toString() {
    return "YAML compound value";
  }
}