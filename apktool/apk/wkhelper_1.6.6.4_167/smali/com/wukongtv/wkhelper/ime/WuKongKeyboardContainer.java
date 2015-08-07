package com.wukongtv.wkhelper.ime; class WuKongKeyboardContainer { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:I
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:Landroid/view/View;
a=0;// 
a=0;// .field private e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->setFocusable(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(ILandroid/widget/LinearLayout;)Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/LinearLayout;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le p0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     instance-of v2, v1, Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(C)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;//     #v0=(Reference,Landroid/inputmethodservice/InputMethodService;);
a=0;//     invoke-virtual {v0, p1}, Landroid/inputmethodservice/InputMethodService;->sendKeyChar(C)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final a(I)Landroid/widget/LinearLayout;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v2, v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final a()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     const v1, 0x7f02001b
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     check-cast p1, Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x2a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(C)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(PosByte);v3=(Uninit);
a=0;//     const/16 v2, 0x4c
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     const/16 v0, 0x2f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(C)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);v2=(PosByte);v3=(Uninit);
a=0;//     const/16 v2, 0x3e
a=0;// 
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(C)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x43
a=0;// 
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;//     #v0=(Reference,Landroid/inputmethodservice/InputMethodService;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getCurrentInputConnection()Landroid/view/inputmethod/InputConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getCurrentInputConnection()Landroid/view/inputmethod/InputConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/view/inputmethod/InputConnection;->deleteSurroundingText(II)Z
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x42
a=0;// 
a=0;//     if-ne v0, v2, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;//     #v0=(Reference,Landroid/inputmethodservice/InputMethodService;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/inputmethodservice/InputMethodService;->hideWindow()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;//     #v0=(Reference,Landroid/inputmethodservice/InputMethodService;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getCurrentInputConnection()Landroid/view/inputmethod/InputConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/inputmethod/InputConnection;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-interface {v2, v1, v3}, Landroid/view/inputmethod/InputConnection;->commitText(Ljava/lang/CharSequence;I)Z
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/ime/ComposingView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/ComposingView;->invalidate()V
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v1, v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setService(Landroid/inputmethodservice/InputMethodService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->e:Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
