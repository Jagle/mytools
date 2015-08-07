package com.wukongtv.wkhelper.ime; class CandidatesContainer { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/ime/CandidatesContainer;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// .implements Landroid/view/animation/Animation$AnimationListener;
a=0;// .implements Lcom/wukongtv/wkhelper/ime/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field b:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;// .field d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;// .field e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidatesContainer;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/widget/ImageButton;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/widget/ImageButton;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0xff
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->setAlpha(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->setAlpha(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     iget-object v4, v3, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v5, v0, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     iget-object v4, v3, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, v3, Lcom/wukongtv/wkhelper/ime/k;->m:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v3, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v3, v1}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     :goto_3
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v0, v1}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v3, v2}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v0, v2}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b(Landroid/widget/ImageButton;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActiveCandiatePos()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/CandidateView;->getActiveCandiatePosGlobal()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentPage()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Landroid/view/animation/Animation;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageButton;->isPressed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageButton;->isPressed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ViewFlipper;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/ime/h;->a()Lcom/wukongtv/wkhelper/ime/h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/h;);
a=0;//     iget v1, v0, Lcom/wukongtv/wkhelper/ime/h;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v0, v0, Lcom/wukongtv/wkhelper/ime/h;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-super {p0, v1, v0}, Landroid/widget/RelativeLayout;->onMeasure(II)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageButton;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->f:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ClickableViewAccessibility"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->b:Landroid/widget/ImageButton;
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ViewFlipper;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 10
a=0;// 
a=0;//     iget v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/ime/CandidatesContainer;->d:Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ViewFlipper;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     iget v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/wukongtv/wkhelper/ime/k;->a(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->d:I
a=0;// 
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidateView;);v1=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->i:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v3, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->h:Lcom/wukongtv/wkhelper/ime/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/e;);
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/e;->a()Z
a=0;// 
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/wukongtv/wkhelper/ime/b;->a(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Integer);v3=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/b;);
a=0;//     iget-object v2, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/c;);
a=0;//     iget-boolean v2, v2, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/c;->a()Z
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->g:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     iget v2, v1, Landroid/graphics/RectF;->right:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v4, v1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float/2addr v2, v4
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v4, v2
a=0;// 
a=0;//     iget v2, v1, Landroid/graphics/RectF;->bottom:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v5, v1, Landroid/graphics/RectF;->top:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float/2addr v2, v5
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v5, v2
a=0;// 
a=0;//     iget-object v6, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     #v6=(Reference,Lcom/wukongtv/wkhelper/ime/b;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v7, v2, Lcom/wukongtv/wkhelper/ime/k;->n:Ljava/util/List;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     iget v8, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->d:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v2, v8}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     iget v7, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->f:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, v6, Lcom/wukongtv/wkhelper/ime/b;->c:Lcom/wukongtv/wkhelper/ime/d;
a=0;// 
a=0;//     #v8=(Reference,Lcom/wukongtv/wkhelper/ime/d;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     iput-object v9, v8, Lcom/wukongtv/wkhelper/ime/d;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iput-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/high16 v9, 0x42300000
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     iget-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setFakeBoldText(Z)V
a=0;// 
a=0;//     iget-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     iget-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->d:Landroid/graphics/Paint$FontMetricsInt;
a=0;// 
a=0;//     iget-object v2, v8, Lcom/wukongtv/wkhelper/ime/d;->c:Landroid/graphics/Paint;
a=0;// 
a=0;//     const-string v7, "..."
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, v8, Lcom/wukongtv/wkhelper/ime/d;->e:F
a=0;// 
a=0;//     iget v2, v6, Lcom/wukongtv/wkhelper/ime/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v4, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget v7, v6, Lcom/wukongtv/wkhelper/ime/b;->d:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v5, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iget-object v7, v6, Lcom/wukongtv/wkhelper/ime/b;->c:Lcom/wukongtv/wkhelper/ime/d;
a=0;// 
a=0;//     #v7=(Reference,Lcom/wukongtv/wkhelper/ime/d;);
a=0;//     invoke-virtual {v7, v2, v5}, Lcom/wukongtv/wkhelper/ime/d;->measure(II)V
a=0;// 
a=0;//     iget-object v2, v6, Lcom/wukongtv/wkhelper/ime/b;->c:Lcom/wukongtv/wkhelper/ime/d;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/d;);
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/ime/d;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, v6, Lcom/wukongtv/wkhelper/ime/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v5, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v2, v5
a=0;// 
a=0;//     iget-object v5, v6, Lcom/wukongtv/wkhelper/ime/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v5, v5, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v2, v5
a=0;// 
a=0;//     iget-object v5, v6, Lcom/wukongtv/wkhelper/ime/b;->c:Lcom/wukongtv/wkhelper/ime/d;
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/ime/d;);
a=0;//     invoke-virtual {v5}, Lcom/wukongtv/wkhelper/ime/d;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v7, v6, Lcom/wukongtv/wkhelper/ime/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v7, v7, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v5, v7
a=0;// 
a=0;//     iget-object v7, v6, Lcom/wukongtv/wkhelper/ime/b;->a:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v7, v7, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v5, v7
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Lcom/wukongtv/wkhelper/ime/b;->setWidth(I)V
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Lcom/wukongtv/wkhelper/ime/b;->setHeight(I)V
a=0;// 
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->j:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/wkhelper/ime/CandidateView;->getLocationOnScreen([I)V
a=0;// 
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->b:[I
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-object v6, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->j:[I
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget v6, v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v1, v1, Landroid/graphics/RectF;->left:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v7, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     #v7=(Reference,Lcom/wukongtv/wkhelper/ime/b;);
a=0;//     invoke-virtual {v7}, Lcom/wukongtv/wkhelper/ime/b;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v4, v7, v4
a=0;// 
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sub-float/2addr v1, v4
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v6
a=0;// 
a=0;//     aput v1, v2, v5
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->b:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v4, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/b;);
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/ime/b;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     neg-int v4, v4
a=0;// 
a=0;//     aput v4, v1, v2
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/b;->dismiss()V
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/wukongtv/wkhelper/ime/b;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/b;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->b:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/c;);
a=0;//     iget-boolean v4, v4, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/c;);
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/ime/c;->a()Z
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_7
a=0;// 
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->b:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     iget-object v5, v1, Lcom/wukongtv/wkhelper/ime/b;->f:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {v4, v5}, Landroid/view/View;->getLocationInWindow([I)V
a=0;// 
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->b:Landroid/view/View;
a=0;// 
a=0;//     const/16 v5, 0x33
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget v6, v2, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget v2, v2, v7
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v7, v1, Lcom/wukongtv/wkhelper/ime/b;->f:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aget v7, v7, v8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v2, v7
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5, v6, v2}, Lcom/wukongtv/wkhelper/ime/b;->showAtLocation(Landroid/view/View;III)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->h:Lcom/wukongtv/wkhelper/ime/e;
a=0;// 
a=0;//     iget v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, v1, Lcom/wukongtv/wkhelper/ime/e;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/wukongtv/wkhelper/ime/CandidateView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a(Lcom/wukongtv/wkhelper/ime/CandidateView;)Lcom/wukongtv/wkhelper/ime/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/e;->a()Z
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1, v1, v4, v5}, Lcom/wukongtv/wkhelper/ime/e;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, v1, Lcom/wukongtv/wkhelper/ime/e;->b:Z
a=0;// 
a=0;//     iput v2, v1, Lcom/wukongtv/wkhelper/ime/e;->c:I
a=0;// 
a=0;//     iput v3, v1, Lcom/wukongtv/wkhelper/ime/e;->d:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/ime/CandidateView;);v1=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ltz v1, :cond_5
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/wukongtv/wkhelper/ime/CandidateView;->invalidate()V
a=0;// 
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->c:Lcom/wukongtv/wkhelper/ime/k;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/k;);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/ime/k;->o:Ljava/util/Vector;
a=0;// 
a=0;//     iget v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->d:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     const-wide/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/wukongtv/wkhelper/ime/b;->a(J)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v1=(Integer);v2=(Integer);v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/wukongtv/wkhelper/ime/CandidateView;->a(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->h:Lcom/wukongtv/wkhelper/ime/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/ime/e;);
a=0;//     iget v2, v2, Lcom/wukongtv/wkhelper/ime/e;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_6
a=0;// 
a=0;//     iget v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->d:I
a=0;// 
a=0;//     iget-object v3, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->h:Lcom/wukongtv/wkhelper/ime/e;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/ime/e;);
a=0;//     iget v3, v3, Lcom/wukongtv/wkhelper/ime/e;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     :cond_6
a=0;//     move v3, v1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/b;);v2=(Reference,[I);v4=(Byte);v5=(LongHi);v6=(LongLo);v7=(LongHi);v8=(Reference,Lcom/wukongtv/wkhelper/ime/d;);v9=(One);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v1, v4, v5, v6, v2}, Lcom/wukongtv/wkhelper/ime/c;->a(JI[I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Boolean);v2=(One);v4=(Integer);v5=(Null);v6=(Integer);v7=(Integer);
a=0;//     iget-object v1, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->a:Lcom/wukongtv/wkhelper/ime/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/wukongtv/wkhelper/ime/b;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/ime/CandidateView;->b:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->c:Lcom/wukongtv/wkhelper/ime/d;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/d;);
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/ime/d;->invalidate()V
a=0;// 
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     iget-boolean v4, v4, Lcom/wukongtv/wkhelper/ime/c;->c:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/ime/c;);
a=0;//     invoke-virtual {v4}, Lcom/wukongtv/wkhelper/ime/c;->a()Z
a=0;// 
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_a
a=0;// 
a=0;//     iget-object v4, v1, Lcom/wukongtv/wkhelper/ime/b;->b:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     iget-object v5, v1, Lcom/wukongtv/wkhelper/ime/b;->f:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {v4, v5}, Landroid/view/View;->getLocationInWindow([I)V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget v4, v2, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aget v2, v2, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, v1, Lcom/wukongtv/wkhelper/ime/b;->f:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v2, v5
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-virtual {v1, v4, v2, v5, v6}, Lcom/wukongtv/wkhelper/ime/b;->update(IIII)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Reference,[I);v4=(Byte);v5=(LongHi);v6=(LongLo);
a=0;//     iget-object v1, v1, Lcom/wukongtv/wkhelper/ime/b;->e:Lcom/wukongtv/wkhelper/ime/c;
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v1, v4, v5, v6, v2}, Lcom/wukongtv/wkhelper/ime/c;->a(JI[I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
