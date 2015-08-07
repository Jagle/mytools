package com.wukongtv.wkhelper.ime; class PinyinIME { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// .super Landroid/inputmethodservice/InputMethodService;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "InlinedApi",
a=0;//         "HandlerLeak"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;// .field private b:Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;// .field private c:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private d:Lcom/wukongtv/wkhelper/ime/m;
a=0;// 
a=0;// .field private e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;// .field private h:Lcom/wukongtv/wkhelper/ime/g;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// .field private j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;// .field private k:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/inputmethodservice/InputMethodService;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/PinyinIME;);
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/ime/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/ime/m;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/ime/m;-><init>(Lcom/wukongtv/wkhelper/ime/PinyinIME;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/m;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->d:Lcom/wukongtv/wkhelper/ime/m;
a=0;// 
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/l;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/ime/k;-><init>(Lcom/wukongtv/wkhelper/ime/PinyinIME;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->g:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->i:Z
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/ime/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/ime/j;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/ime/j;-><init>(Lcom/wukongtv/wkhelper/ime/PinyinIME;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/j;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->k:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/l;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/l;->b:I
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->g:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/k;->a:Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/k;->a:Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v3, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     iput v3, v0, Lcom/wukongtv/wkhelper/ime/k;->b:I
a=0;// 
a=0;//     iput v3, v0, Lcom/wukongtv/wkhelper/ime/k;->k:I
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iput-object v1, v0, Lcom/wukongtv/wkhelper/ime/k;->g:Ljava/lang/String;
a=0;// 
a=0;//     iput v3, v0, Lcom/wukongtv/wkhelper/ime/k;->h:I
a=0;// 
a=0;//     iput-boolean v3, v0, Lcom/wukongtv/wkhelper/ime/k;->i:Z
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iput-object v1, v0, Lcom/wukongtv/wkhelper/ime/k;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iput-object v1, v0, Lcom/wukongtv/wkhelper/ime/k;->e:Ljava/lang/String;
a=0;// 
a=0;//     iput v3, v0, Lcom/wukongtv/wkhelper/ime/k;->d:I
a=0;// 
a=0;//     iput v3, v0, Lcom/wukongtv/wkhelper/ime/k;->f:I
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/k;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     sget v1, Lcom/wukongtv/wkhelper/ime/f;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/wukongtv/wkhelper/ime/ComposingView;->a:I
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->d:Lcom/wukongtv/wkhelper/ime/m;
a=0;// 
a=0;//     invoke-virtual {v0, v0}, Lcom/wukongtv/wkhelper/ime/m;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->g:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/k;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/ime/PinyinIME;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/wukongtv/wkhelper/ime/PinyinIME;)Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->setCandidatesViewShown(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Lcom/wukongtv/wkhelper/ime/ComposingView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/ComposingView;->invalidate()V
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->g:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     sget v3, Lcom/wukongtv/wkhelper/ime/l;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v3, v5, :cond_2
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iput-object v1, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     iput v2, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/k;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v0, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     iget-object v0, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     iget-object v0, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ViewFlipper;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     iget-object v0, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ViewFlipper;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     iget-object v5, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     invoke-virtual {v0, v5}, Lcom/wukongtv/wkhelper/ime/CandidateView;->setDecodingInfo(Lcom/wukongtv/wkhelper/ime/k;)V
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Reference,Lcom/wukongtv/wkhelper/ime/k;);v3=(Integer);v5=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v3=(Boolean);
a=0;//     iget-object v1, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v1, v0}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     iget-object v1, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v5=(Conflicted);
a=0;//     iget-object v0, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ViewFlipper;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->stopFlipping()V
a=0;// 
a=0;//     iget-object v0, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     iget v1, v4, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a(IIZ)V
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a()V
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->invalidate()V
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->d:Lcom/wukongtv/wkhelper/ime/m;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/m;);
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/ime/m;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v6, v6}, Landroid/widget/LinearLayout;->measure(II)V
a=0;// 
a=0;//     invoke-virtual {v1, v1}, Lcom/wukongtv/wkhelper/ime/m;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/wukongtv/wkhelper/ime/PinyinIME;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(I)V
a=0;//     .locals 17
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getCurrentInputConnection()Landroid/view/inputmethod/InputConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/inputmethod/InputConnection;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     new-instance v3, Landroid/view/KeyEvent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/KeyEvent;);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v9, p1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-direct/range {v3 .. v14}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/KeyEvent;);
a=0;//     new-instance v5, Landroid/view/KeyEvent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/view/KeyEvent;);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     const/16 v16, 0x2
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     move/from16 v11, p1
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-direct/range {v5 .. v16}, Landroid/view/KeyEvent;-><init>(JJIIIIIII)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/KeyEvent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/PinyinIME;);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v5}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/ime/h;->a()Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     invoke-virtual {v0, p1, p0}, Lcom/wukongtv/wkhelper/ime/h;->a(Landroid/content/res/Configuration;Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/inputmethodservice/InputMethodService;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/ime/h;->a()Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     invoke-super {p0}, Landroid/inputmethodservice/InputMethodService;->onCreate()V
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/ime/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/ime/g;);
a=0;//     invoke-direct {v1}, Lcom/wukongtv/wkhelper/ime/g;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/g;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->h:Lcom/wukongtv/wkhelper/ime/g;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/wukongtv/wkhelper/ime/n;->a(Landroid/content/SharedPreferences;)Lcom/wukongtv/wkhelper/ime/n;
a=0;// 
a=0;//     new-instance v1, Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/wukongtv/wkhelper/ime/i;);
a=0;//     invoke-direct {v1}, Lcom/wukongtv/wkhelper/ime/i;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/i;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b:Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p0}, Lcom/wukongtv/wkhelper/ime/h;->a(Landroid/content/res/Configuration;Landroid/content/Context;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->k:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     new-instance v1, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     const-string v2, "com.wukongtv.ime.key_event"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/IntentFilter;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateCandidatesView()Landroid/view/View;
a=0;//     .locals 4
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "InflateParams"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v0, 0x7f03000f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a:Lcom/wukongtv/wkhelper/ime/ComposingView;
a=0;// 
a=0;//     const v0, 0x7f03000e
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->setCandidatesViewShown(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateInputView()Landroid/view/View;
a=0;//     .locals 3
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "InflateParams"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const v1, 0x7f030011
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->setService(Landroid/inputmethodservice/InputMethodService;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/ime/n;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->k:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/BroadcastReceiver;);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     invoke-super {p0}, Landroid/inputmethodservice/InputMethodService;->onDestroy()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDisplayCompletions([Landroid/view/inputmethod/CompletionInfo;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->isFullscreenMode()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(PosByte);v2=(One);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b:Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/ime/i;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b:Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;//     iget v4, v3, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, -0x10000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/2addr v4, v5
a=0;// 
a=0;//     const/high16 v5, 0x10000000
a=0;// 
a=0;//     if-eq v5, v4, :cond_2
a=0;// 
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget v3, v3, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0xf000000
a=0;// 
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     const/high16 v4, 0x1000000
a=0;// 
a=0;//     if-ne v4, v3, :cond_3
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/l;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v0, v3, :cond_5
a=0;// 
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/l;->e:I
a=0;// 
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     sget v0, Lcom/wukongtv/wkhelper/ime/l;->f:I
a=0;// 
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->g:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     invoke-virtual {v3}, Lcom/wukongtv/wkhelper/ime/k;->b()V
a=0;// 
a=0;//     iput-object p1, v3, Lcom/wukongtv/wkhelper/ime/k;->l:[Landroid/view/inputmethod/CompletionInfo;
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     iput v0, v3, Lcom/wukongtv/wkhelper/ime/k;->m:I
a=0;// 
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_9
a=0;// 
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v2, :cond_9
a=0;// 
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->n:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v2, v0
a=0;// 
a=0;//     if-ge v0, v1, :cond_9
a=0;// 
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->n:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, v3, Lcom/wukongtv/wkhelper/ime/k;->m:I
a=0;// 
a=0;//     sub-int/2addr v2, v0
a=0;// 
a=0;//     if-le v2, v1, :cond_a
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/wukongtv/wkhelper/ime/l;->f:I
a=0;// 
a=0;//     iget-object v4, v3, Lcom/wukongtv/wkhelper/ime/k;->r:Lcom/wukongtv/wkhelper/ime/PinyinIME;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/PinyinIME;);
a=0;//     iget v4, v4, Lcom/wukongtv/wkhelper/ime/PinyinIME;->f:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_8
a=0;// 
a=0;//     iget-object v2, v3, Lcom/wukongtv/wkhelper/ime/k;->l:[Landroid/view/inputmethod/CompletionInfo;
a=0;// 
a=0;//     #v2=(Reference,[Landroid/view/inputmethod/CompletionInfo;);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);v4=(Conflicted);
a=0;//     if-ge v0, v1, :cond_7
a=0;// 
a=0;//     iget-object v4, v3, Lcom/wukongtv/wkhelper/ime/k;->l:[Landroid/view/inputmethod/CompletionInfo;
a=0;// 
a=0;//     #v4=(Reference,[Landroid/view/inputmethod/CompletionInfo;);
a=0;//     aget-object v4, v4, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/inputmethod/CompletionInfo;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_6
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->n:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     iget-object v0, v3, Lcom/wukongtv/wkhelper/ime/k;->n:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v3, Lcom/wukongtv/wkhelper/ime/k;->i:Z
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Integer);v3=(Reference,Lcom/wukongtv/wkhelper/ime/k;);v4=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onFinishCandidatesView(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/inputmethodservice/InputMethodService;->onFinishCandidatesView(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onFinishInput()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     invoke-super {p0}, Landroid/inputmethodservice/InputMethodService;->onFinishInput()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onFinishInputView(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/inputmethodservice/InputMethodService;->onFinishInputView(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Landroid/inputmethodservice/InputMethodService;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0x17
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     const v3, 0x7f02001a
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);v1=(Integer);v4=(Conflicted);
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(ILandroid/widget/LinearLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a()V
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(Null);v2=(Reference,Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;);v4=(Uninit);
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-le v0, v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     :cond_4
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(I)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(I)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(I)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(I)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->getTag()Ljava/lang/Object;
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
a=0;//     iget v3, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     iput v3, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     iget v3, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     add-int/lit8 v4, v1, -0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v3, v4, :cond_2
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_4
a=0;//     #v0=(Integer);v1=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, v2, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->performClick()Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/inputmethodservice/InputMethodService;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x13 -> :sswitch_1
a=0;//         0x14 -> :sswitch_0
a=0;//         0x15 -> :sswitch_2
a=0;//         0x16 -> :sswitch_3
a=0;//         0x17 -> :sswitch_4
a=0;//         0x42 -> :sswitch_4
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public onStartInput(Landroid/view/inputmethod/EditorInfo;Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/high16 v0, 0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b:Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/ime/i;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v4, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0xf
a=0;// 
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget v1, v3, Lcom/wukongtv/wkhelper/ime/i;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0xf000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     if-ne v1, v0, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v3, v0}, Lcom/wukongtv/wkhelper/ime/i;->a(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->hideStatusIcon()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v1=(One);v2=(Null);v5=(Uninit);
a=0;//     iget v4, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I
a=0;// 
a=0;//     and-int/lit16 v4, v4, 0xff0
a=0;// 
a=0;//     const/16 v5, 0x20
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v4, v5, :cond_1
a=0;// 
a=0;//     const/16 v5, 0x80
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-eq v4, v5, :cond_1
a=0;// 
a=0;//     const/16 v5, 0x90
a=0;// 
a=0;//     if-eq v4, v5, :cond_1
a=0;// 
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Integer);v5=(Conflicted);
a=0;//     const/high16 v0, 0x2000000
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onStartInputView(Landroid/view/inputmethod/EditorInfo;Z)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/high16 v4, -0x10000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v0, 0x12100000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->b:Lcom/wukongtv/wkhelper/ime/i;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/i;);
a=0;//     iget v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0xf
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     and-int v3, v1, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     const/high16 v3, 0xf000000
a=0;// 
a=0;//     and-int/2addr v1, v3
a=0;// 
a=0;//     const/high16 v3, 0x1000000
a=0;// 
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     const/high16 v0, 0x11000000
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2, v0}, Lcom/wukongtv/wkhelper/ime/i;->a(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->hideStatusIcon()V
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->a()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->setCandidatesViewShown(Z)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v3=(Uninit);
a=0;//     const/high16 v0, 0x22000000
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     const/high16 v0, 0x50000000
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     iget v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I
a=0;// 
a=0;//     and-int/lit16 v1, v1, 0xff0
a=0;// 
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     const/16 v3, 0x90
a=0;// 
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     and-int v3, v1, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v1, v2, Lcom/wukongtv/wkhelper/ime/i;->a:I
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onWindowHidden()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/inputmethodservice/InputMethodService;->onWindowHidden()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->i:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onWindowShown()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-super {p0}, Landroid/inputmethodservice/InputMethodService;->onWindowShown()V
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->i:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->j:Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     iput v2, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     const/high16 v2, -0x1000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     const v2, 0x7f02001a
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget v0, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->c:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(I)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a(ILandroid/widget/LinearLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, v1, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->d:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/WuKongKeyboardContainer;->a()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public requestHideSelf(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->e:Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/PinyinIME;->d:Lcom/wukongtv/wkhelper/ime/m;
a=0;// 
a=0;//     invoke-virtual {v0, v0}, Lcom/wukongtv/wkhelper/ime/m;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/ime/PinyinIME;->setCandidatesViewShown(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     invoke-super {p0, p1}, Landroid/inputmethodservice/InputMethodService;->requestHideSelf(I)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
