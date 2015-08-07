package android.support.v4.app; class q { void a() { int a;
a=0;// .class final Landroid/support/v4/app/q;
a=0;// .super Landroid/support/v4/app/p;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/LayoutInflater$Factory;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final A:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final B:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final C:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static a:Z
a=0;// 
a=0;// .field static final b:Z
a=0;// 
a=0;// .field static final z:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field c:Ljava/util/ArrayList;
a=0;// 
a=0;// .field d:[Ljava/lang/Runnable;
a=0;// 
a=0;// .field e:Z
a=0;// 
a=0;// .field f:Ljava/util/ArrayList;
a=0;// 
a=0;// .field g:Ljava/util/ArrayList;
a=0;// 
a=0;// .field h:Ljava/util/ArrayList;
a=0;// 
a=0;// .field i:Ljava/util/ArrayList;
a=0;// 
a=0;// .field j:Ljava/util/ArrayList;
a=0;// 
a=0;// .field k:Ljava/util/ArrayList;
a=0;// 
a=0;// .field l:Ljava/util/ArrayList;
a=0;// 
a=0;// .field m:Ljava/util/ArrayList;
a=0;// 
a=0;// .field n:I
a=0;// 
a=0;// .field o:Landroid/support/v4/app/m;
a=0;// 
a=0;// .field p:Landroid/support/v4/app/o;
a=0;// 
a=0;// .field q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field r:Z
a=0;// 
a=0;// .field s:Z
a=0;// 
a=0;// .field t:Z
a=0;// 
a=0;// .field u:Ljava/lang/String;
a=0;// 
a=0;// .field v:Z
a=0;// 
a=0;// .field w:Landroid/os/Bundle;
a=0;// 
a=0;// .field x:Landroid/util/SparseArray;
a=0;// 
a=0;// .field y:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/high16 v4, 0x40200000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v3, 0x3fc00000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sput-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Landroid/support/v4/app/q;->b:Z
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/q;->z:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/q;->A:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v0, v4}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/q;->B:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v0, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/q;->C:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/p;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/q;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/r;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/r;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/r;-><init>(Landroid/support/v4/app/q;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/r;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->y:Ljava/lang/Runnable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Fragment no longer exists for key "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ": index "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Fragment no longer exists for key "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ": index "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(FF)Landroid/view/animation/Animation;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     sget-object v1, Landroid/support/v4/app/q;->A:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     const-wide/16 v2, 0xdc
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(FFFF)Landroid/view/animation/Animation;
a=0;//     .locals 12
a=0;// 
a=0;//     const-wide/16 v10, 0xdc
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/high16 v6, 0x3f000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-instance v9, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     move v1, p0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move v3, p0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move v4, p1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     move v7, v5
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v6
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     sget-object v1, Landroid/support/v4/app/q;->z:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     invoke-virtual {v0, v10, v11}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     sget-object v1, Landroid/support/v4/app/q;->A:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     invoke-virtual {v0, v10, v11}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     return-object v9
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;//     .locals 6
a=0;// 
a=0;//     const v5, 0x3f79999a
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/high16 v3, 0x3f800000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Landroid/support/v4/app/Fragment;->d()Landroid/view/animation/Animation;
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     :goto_1
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Byte);
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Byte);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     if-nez p4, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/m;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/m;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget p4, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     if-nez p4, :cond_7
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);
a=0;//     const/high16 v0, 0x3f900000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, v3, v4, v3}, Landroid/support/v4/app/q;->a(FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v3, v5, v3, v4}, Landroid/support/v4/app/q;->a(FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v5, v3, v4, v3}, Landroid/support/v4/app/q;->a(FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Byte);
a=0;//     const v0, 0x3f89999a
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v3, v0, v3, v4}, Landroid/support/v4/app/q;->a(FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v4, v3}, Landroid/support/v4/app/q;->a(FF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/app/q;->a(FF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1001 -> :sswitch_0
a=0;//         0x1003 -> :sswitch_2
a=0;//         0x2002 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private a(ILandroid/support/v4/app/c;)V
a=0;//     .locals 3
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_2
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Setting back stack index "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " to "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, p1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Adding back stack index "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " with "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v2, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/RuntimeException;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     const-string v1, "Activity state:"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/c/e;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/c/e;);
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/c/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/c/e;);
a=0;//     new-instance v1, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintWriter;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3, v1, v4}, Landroid/support/v4/app/m;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     throw p1
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     const-string v2, "Failed dumping state"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "  "
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v2, v1, v3}, Landroid/support/v4/app/q;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     const-string v2, "Failed dumping state"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sparse-switch p0, :sswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x2002
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x1001
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x1003
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1001 -> :sswitch_0
a=0;//         0x1003 -> :sswitch_2
a=0;//         0x2002 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->x:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private c(I)Landroid/support/v4/app/Fragment;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, p1, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private n()V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move v6, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-boolean v0, v1, Landroid/support/v4/app/Fragment;->L:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->e:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->v:Z
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v6, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v3, v1, Landroid/support/v4/app/Fragment;->L:Z
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/support/v4/app/c;)I
a=0;//     .locals 3
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-boolean v1, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Setting back stack index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " to "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
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
a=0;//     sget-boolean v1, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Adding back stack index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " with "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a()Landroid/support/v4/app/y;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/c;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/c;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/c;-><init>(Landroid/support/v4/app/q;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method final a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0, v0, v0}, Landroid/support/v4/app/q;->a(IIIZ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(IIIZ)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     if-nez p4, :cond_2
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iput p1, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v7, v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);v7=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/ai;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v7, v0
a=0;// 
a=0;//     move v1, v7
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v6, v0
a=0;// 
a=0;//     move v7, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/q;->n()V
a=0;// 
a=0;//     :cond_4
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_5
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/app/b;->a(Landroid/app/Activity;)V
a=0;// 
a=0;//     :goto_3
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/app/m;->i:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);v2=(Conflicted);
a=0;//     move v1, v7
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/content/res/Configuration;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/q;->a(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     check-cast p1, Landroid/support/v4/app/FragmentManagerState;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     sget-boolean v3, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "restoreAllState: re-attaching retained "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v3=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     iget v4, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget-object v3, v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v0, v3, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v7, v0, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     iput-object v7, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v4, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     iget-object v4, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/m;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/app/m;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     iget-object v4, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v5, "android:view_state"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v0, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v3, v0, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_c
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/m;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/app/m;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, v1, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-static {v3, v5, v6}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/app/m;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v6, v1, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object v6, v5, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     :cond_7
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v6, v1, Landroid/support/v4/app/FragmentState;->b:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6, v4}, Landroid/support/v4/app/Fragment;->a(ILandroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v5, v1, Landroid/support/v4/app/FragmentState;->c:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, v4, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-boolean v8, v4, Landroid/support/v4/app/Fragment;->r:Z
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v5, v1, Landroid/support/v4/app/FragmentState;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, v4, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v5, v1, Landroid/support/v4/app/FragmentState;->e:I
a=0;// 
a=0;//     iput v5, v4, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/FragmentState;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, v4, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v5, v1, Landroid/support/v4/app/FragmentState;->g:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, v4, Landroid/support/v4/app/Fragment;->C:Z
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v5, v1, Landroid/support/v4/app/FragmentState;->h:Z
a=0;// 
a=0;//     iput-boolean v5, v4, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/support/v4/app/m;->b:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-object v3, v4, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     sget-boolean v3, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Instantiated fragment "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     sget-boolean v4, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "restoreAllState: active #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iput-object v7, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Null);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-eqz p2, :cond_f
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v3, v0, :cond_f
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/app/Fragment;->k:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_d
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/app/Fragment;->k:I
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_e
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v4, v0, Landroid/support/v4/app/Fragment;->k:I
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     :cond_d
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Integer);v4=(Integer);
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Re-attaching retained fragment "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " target no longer exists: "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->k:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iput-object v7, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_14
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v3, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-nez v0, :cond_10
a=0;// 
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "No instantiated fragment for index #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I
a=0;// 
a=0;//     aget v5, v5, v1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v3}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_10
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-boolean v8, v0, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     sget-boolean v3, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_11
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "restoreAllState: added #"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ": "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_11
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_12
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Already added!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_12
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Reference,[I);v1=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v7, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1, p0}, Landroid/support/v4/app/BackStackState;->a(Landroid/support/v4/app/q;)Landroid/support/v4/app/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/c;);
a=0;//     sget-boolean v3, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_15
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "restoreAllState: back stack #"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " (index "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v1, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "): "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v3, Landroid/support/v4/c/e;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/c/e;);
a=0;//     const-string v4, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Landroid/support/v4/c/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/c/e;);
a=0;//     new-instance v4, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/PrintWriter;);
a=0;//     const-string v3, "  "
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4, v2}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
a=0;// 
a=0;//     :cond_15
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget v3, v1, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_16
a=0;// 
a=0;//     iget v3, v1, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     invoke-direct {p0, v3, v1}, Landroid/support/v4/app/q;->a(ILandroid/support/v4/app/c;)V
a=0;// 
a=0;//     :cond_16
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_17
a=0;//     #v0=(Reference,[Landroid/support/v4/app/BackStackState;);v1=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v7, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "remove: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " nesting="
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_2
a=0;//     iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     :cond_3
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     iput-boolean v1, p1, Landroid/support/v4/app/Fragment;->n:Z
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     :goto_2
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(One);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     move v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v2=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method final a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     if-le p2, v5, :cond_1
a=0;// 
a=0;//     move p2, v5
a=0;// 
a=0;//     :cond_1
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->n:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p2, v0, :cond_2
a=0;// 
a=0;//     iget p2, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     :cond_2
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->L:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v9, :cond_3
a=0;// 
a=0;//     if-le p2, v6, :cond_3
a=0;// 
a=0;//     move p2, v6
a=0;// 
a=0;//     :cond_3
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     if-ge v0, p2, :cond_27
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v4=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     iput p2, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v8=(Uninit);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "moveto CREATED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/m;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/m;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android:view_state"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android:target_state"
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/app/q;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android:target_req_state"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/support/v4/app/Fragment;->l:I
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android:user_visible_hint"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->M:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->M:Z
a=0;// 
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->L:Z
a=0;// 
a=0;//     if-le p2, v6, :cond_9
a=0;// 
a=0;//     move p2, v6
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->w:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     :goto_2
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onAttach()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/m;->b:Landroid/support/v4/app/q;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->w:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_f
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-boolean v3, v1, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     :cond_c
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onCreate()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     const-string v1, "android:support:fragments"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->g()V
a=0;// 
a=0;//     :cond_e
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v7}, Landroid/support/v4/app/q;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->g()V
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->c()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->h()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/app/ak;->a(Landroid/view/View;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-static {}, Landroid/support/v4/app/Fragment;->e()V
a=0;// 
a=0;//     :cond_11
a=0;//     :goto_3
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);
a=0;//     if-le p2, v5, :cond_20
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "moveto ACTIVITY_CREATED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_19
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_42
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/o;);
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/app/o;->a(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->r:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_15
a=0;// 
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "No view found for id 0x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v4, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, " ("
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     if-nez v4, :cond_14
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " not attached to Activity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_13
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_14
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);v2=(Reference,Ljava/lang/StringBuilder;);v4=(Reference,Landroid/support/v4/app/m;);
a=0;//     iget-object v4, p1, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/m;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v8, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, ") for fragment "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_15
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->c()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->h()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v1, :cond_1b
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     iput-object v1, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/app/ak;->a(Landroid/view/View;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     invoke-direct {p0, p1, p3, v5, p4}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_16
a=0;// 
a=0;//     iget-object v2, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_16
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_17
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_18
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-static {}, Landroid/support/v4/app/Fragment;->e()V
a=0;// 
a=0;//     :cond_19
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     if-eqz v0, :cond_1a
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-boolean v3, v0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     :cond_1a
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1c
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onActivityCreated()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1b
a=0;//     #v2=(Conflicted);
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_1c
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v0, :cond_1d
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->h()V
a=0;// 
a=0;//     :cond_1d
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1f
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-eqz v0, :cond_1e
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     :cond_1e
a=0;//     #v1=(Conflicted);
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1f
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onViewStateRestored()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1f
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     :cond_20
a=0;//     :pswitch_2
a=0;//     if-le p2, v6, :cond_22
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_21
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "moveto STARTED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_21
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->i()V
a=0;// 
a=0;//     :cond_22
a=0;//     :pswitch_3
a=0;//     if-le p2, v9, :cond_6
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_23
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "moveto RESUMED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_23
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->o:Z
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v0, :cond_24
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-boolean v3, v0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->d()Z
a=0;// 
a=0;//     :cond_24
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_25
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onResume()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_25
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v0, :cond_26
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->j()V
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->d()Z
a=0;// 
a=0;//     :cond_26
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_27
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v4=(Uninit);v8=(Uninit);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     if-le v0, p2, :cond_6
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_28
a=0;//     :goto_6
a=0;//     :pswitch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-gtz p2, :cond_6
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->t:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_29
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_29
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
a=0;// 
a=0;//     :cond_29
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_3a
a=0;// 
a=0;//     iput p2, p1, Landroid/support/v4/app/Fragment;->d:I
a=0;// 
a=0;//     move p2, v5
a=0;// 
a=0;//     #p2=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v1=(Uninit);p2=(Integer);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_2d
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2a
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "movefrom RESUMED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2a
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v0, :cond_2b
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     :cond_2b
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2c
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onPause()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2c
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Uninit);
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->o:Z
a=0;// 
a=0;//     :cond_2d
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     if-ge p2, v9, :cond_30
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2e
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "movefrom STARTED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2e
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v0, :cond_2f
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->k()V
a=0;// 
a=0;//     :cond_2f
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_30
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onStop()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_30
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Uninit);
a=0;//     if-ge p2, v6, :cond_32
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_31
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "movefrom STOPPED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_31
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->j()V
a=0;// 
a=0;//     :cond_32
a=0;//     :pswitch_8
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_28
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_33
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "movefrom ACTIVITY_CREATED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_33
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_34
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/m;->isFinishing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_34
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-nez v0, :cond_34
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/q;->b(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     :cond_34
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v0, :cond_35
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     :cond_35
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_36
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onDestroyView()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_36
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Uninit);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ai;);
a=0;//     if-eqz v0, :cond_37
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/ai;->e()V
a=0;// 
a=0;//     :cond_37
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_39
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-eqz v0, :cond_39
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_41
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->t:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_41
a=0;// 
a=0;//     invoke-direct {p0, p1, p3, v3, p4}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v0, :cond_38
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p1, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     iput p2, p1, Landroid/support/v4/app/Fragment;->d:I
a=0;// 
a=0;//     new-instance v1, Landroid/support/v4/app/s;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/s;);
a=0;//     invoke-direct {v1, p0, p1}, Landroid/support/v4/app/s;-><init>(Landroid/support/v4/app/q;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/s;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_38
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_39
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_3a
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3b
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "movefrom CREATED: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_3b
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3c
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->k()V
a=0;// 
a=0;//     :cond_3c
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     if-nez v0, :cond_3d
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/am;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/am;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onDetach()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/am;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/am;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3d
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Uninit);
a=0;//     if-nez p5, :cond_6
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     if-nez v0, :cond_40
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_6
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3e
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Freeing fragment index "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_3e
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v0, :cond_3f
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_3f
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/m;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->h:Ljava/lang/String;
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->n:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->o:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->r:Z
a=0;// 
a=0;//     iput v3, p1, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iput v3, p1, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     iput v3, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->O:Z
a=0;// 
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->P:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_40
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->w:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_41
a=0;//     #v0=(Integer);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_42
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_4
a=0;//         :pswitch_8
a=0;//         :pswitch_7
a=0;//         :pswitch_6
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/support/v4/app/Fragment;Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "add: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_5
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->a(ILandroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Allocated fragment index "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment already added: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
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
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->a(ILandroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->n:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     :cond_7
a=0;//     if-eqz p2, :cond_8
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     :cond_8
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/support/v4/app/m;Landroid/support/v4/app/o;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Already attached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     iput-object p3, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "    "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_e
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Active Fragments in "
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, ":"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v2, v4, :cond_e
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mFragmentId=#"
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, " mContainerId=#"
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, " mTag="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mState="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, " mIndex="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, " mWho="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, " mBackStackNesting="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->s:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mAdded="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mRemoving="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->n:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mResumed="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->o:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mFromLayout="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mInLayout="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mHidden="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mDetached="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mMenuVisible="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mHasMenu="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mRetainInstance="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->C:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mRetaining="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v5, " mUserVisibleHint="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, v0, Landroid/support/v4/app/Fragment;->M:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mFragmentManager="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mActivity="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->u:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->w:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mParentFragment="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->w:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mArguments="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mSavedFragmentState="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mSavedViewState="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_5
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mTarget="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v5, " mTargetRequestCode="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->l:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Conflicted);
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mNextAnim="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->H:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     :cond_7
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mContainer="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->I:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_8
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v5, :cond_9
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mView="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_9
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->K:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mInnerView="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_a
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v5, :cond_b
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mAnimatingAway="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->c:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mStateAfterAnimating="
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     :cond_b
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/ai;);
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "Loader Manager:"
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "  "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6, p3}, Landroid/support/v4/app/ai;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     :cond_c
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     if-eqz v5, :cond_d
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Child "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ":"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "  "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5, p2, p3, p4}, Landroid/support/v4/app/q;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_d
a=0;//     #v6=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_f
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Added Fragments:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v4, :cond_f
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_10
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Fragments Created Menus:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v4, :cond_10
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_11
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Back Stack:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v4, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/c;
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v3, p3}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_12
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Back Stack Indices:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_12
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/c;
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v4, "  #"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v4, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_13
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mAvailBackStackIndices: "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->l:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_14
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Pending Actions:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     if-ge v1, v2, :cond_14
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "  #"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v3, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "FragmentManager misc state:"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mActivity="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mContainer="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mParent="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_15
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mCurState="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     const-string v0, " mStateSaved="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v0, " mDestroyed="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->t:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mNeedMenuInvalidate="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     :cond_16
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->u:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mNoTransactionsBecause="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->u:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_17
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_18
a=0;// 
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "  mAvailIndices: "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_18
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/Menu;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Boolean);v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v6, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/q;->a(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v4, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);
a=0;//     move v3, v2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v6=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Integer);v4=(Boolean);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Boolean);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v3, v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/ArrayList;);v3=(Boolean);v4=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v4, v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_9
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     iget-boolean v6, v0, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     move v6, v2
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v7, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     iget-object v7, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v7, p1, p2}, Landroid/support/v4/app/q;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     or-int/2addr v6, v7
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v6=(Conflicted);
a=0;//     add-int/lit8 v3, v4, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Null);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move v3, v5
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/ArrayList;);v3=(Boolean);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v5=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v5, v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Landroid/support/v4/app/Fragment;->f()V
a=0;// 
a=0;//     :cond_5
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     return v3
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v4=(Integer);v5=(Null);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v6=(Boolean);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v6=(Boolean);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/MenuItem;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/q;->a(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "hide: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0, p3}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {}, Landroid/support/v4/app/Fragment;->a()V
a=0;// 
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/view/Menu;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/q;->b(Landroid/view/Menu;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/q;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/view/MenuItem;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v4, v0, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/q;->b(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final c()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Can not perform this action after onSaveInstanceState"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->u:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Can not perform this action inside of "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/q;->u:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "show: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->A:Z
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, v3, p3}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {}, Landroid/support/v4/app/Fragment;->a()V
a=0;// 
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "detach: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "remove from detach: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_2
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     :cond_3
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d()Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/q;->e:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Recursive entry to executePendingTransactions"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/m;);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/m;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Must be called from main thread of process"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/q;->v:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Integer);v4=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/ai;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->N:Landroid/support/v4/app/ai;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/ai;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v4, v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(One);v4=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->d:[Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->d:[Ljava/lang/Runnable;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     new-array v1, v3, [Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Runnable;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->d:[Ljava/lang/Runnable;
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->d:[Ljava/lang/Runnable;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->c:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/m;->a:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->y:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->e:Z
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v3, :cond_7
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->d:[Ljava/lang/Runnable;
a=0;// 
a=0;//     aget-object v4, v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v4}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->d:[Ljava/lang/Runnable;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Runnable;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(One);v1=(Integer);v3=(Integer);v4=(Reference,Ljava/lang/Object;);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/q;->e:Z
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Boolean);v4=(Boolean);
a=0;//     if-nez v4, :cond_9
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/q;->v:Z
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/q;->n()V
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method final e()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->m:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->m:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->m:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final e(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "attach: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment already added: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(One);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "add from attach: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->m:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->E:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->F:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/q;->r:Z
a=0;// 
a=0;//     :cond_4
a=0;//     iget v2, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final f()Landroid/os/Parcelable;
a=0;//     .locals 14
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/q;->d()Z
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/support/v4/app/FragmentManagerState;);v3=(Integer);v4=(Reference,Ljava/lang/Object;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Null);v3=(One);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v7, v6, [Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v1, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v5, v6, :cond_10
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gez v1, :cond_3
a=0;// 
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Failure saving state: active "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " has cleared index: "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v8, Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-direct {v8, v0}, Landroid/support/v4/app/FragmentState;-><init>(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     aput-object v8, v7, v5
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/app/Fragment;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_f
a=0;// 
a=0;//     iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v1, :cond_f
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/Fragment;->a(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Bundle;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_17
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v2, p0, Landroid/support/v4/app/q;->w:Landroid/os/Bundle;
a=0;// 
a=0;//     :goto_2
a=0;//     iget-object v9, v0, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/q;->b(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     :cond_5
a=0;//     iget-object v9, v0, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-eqz v9, :cond_7
a=0;// 
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v9, "android:view_state"
a=0;// 
a=0;//     iget-object v10, v0, Landroid/support/v4/app/Fragment;->f:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v10=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v10=(Conflicted);
a=0;//     iget-boolean v9, v0, Landroid/support/v4/app/Fragment;->M:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_9
a=0;// 
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v9, "android:user_visible_hint"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v10, v0, Landroid/support/v4/app/Fragment;->M:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     :cond_9
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     iput-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, v1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gez v1, :cond_a
a=0;// 
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Failure saving state: "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, " has target not in fragment manager: "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iget-object v10, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v9, "android:target_state"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, v0, Landroid/support/v4/app/Fragment;->j:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v11, v10, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-gez v11, :cond_c
a=0;// 
a=0;//     new-instance v11, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Fragment "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, " is not currently in the FragmentManager"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v11}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_c
a=0;//     #v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget v10, v10, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/app/Fragment;->l:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v9, "android:target_req_state"
a=0;// 
a=0;//     iget v10, v0, Landroid/support/v4/app/Fragment;->l:I
a=0;// 
a=0;//     invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     :cond_d
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     sget-boolean v1, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Saved state of "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_e
a=0;//     #v1=(Conflicted);v9=(Conflicted);
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Boolean);v8=(Conflicted);
a=0;//     add-int/lit8 v1, v5, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v5, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Conflicted);v8=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     iget-object v1, v0, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v1=(Boolean);v8=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-lez v5, :cond_13
a=0;// 
a=0;//     new-array v1, v5, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     if-ge v3, v5, :cond_14
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aput v0, v1, v3
a=0;// 
a=0;//     aget v0, v1, v3
a=0;// 
a=0;//     if-gez v0, :cond_11
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Failure saving state: active "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v8, " has cleared index: "
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aget v8, v1, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "saveAllState: adding fragment #"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Boolean);v3=(One);v6=(Integer);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);v1=(Reference,[I);v3=(Integer);v6=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-lez v5, :cond_16
a=0;// 
a=0;//     new-array v2, v5, [Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v2=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/Object;);
a=0;//     if-ge v3, v5, :cond_16
a=0;// 
a=0;//     new-instance v4, Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v4/app/BackStackState;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/c;
a=0;// 
a=0;//     invoke-direct {v4, v0}, Landroid/support/v4/app/BackStackState;-><init>(Landroid/support/v4/app/c;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/BackStackState;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "saveAllState: adding back stack #"
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/q;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_16
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerState;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerState;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerState;);
a=0;//     iput-object v7, v0, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/app/FragmentManagerState;->b:[I
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_17
a=0;//     #v1=(Boolean);v2=(Null);v3=(One);v4=(Null);v6=(Integer);v8=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_18
a=0;//     #v1=(Boolean);v8=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public final g()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final h()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final i()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final j()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final k()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->s:Z
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final l()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/q;->t:Z
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/q;->d()Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/q;->a(I)V
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->p:Landroid/support/v4/app/o;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final m()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->onLowMemory()V
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/q;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->v:Landroid/support/v4/app/q;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/q;->m()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v0, "fragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Reference,Landroid/support/v4/app/Fragment;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const-string v0, "class"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v1, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v4, Landroid/support/v4/app/t;->a:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     invoke-virtual {p2, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/m;);
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/app/Fragment;->b(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     if-eq v7, v5, :cond_5
a=0;// 
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/app/q;->c(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Landroid/support/v4/app/q;->c(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     sget-boolean v1, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "onCreateView: id=0x"
a=0;// 
a=0;//     invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, " fname="
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, " existing="
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     invoke-static {p2, v6}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iput-boolean v2, v1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     move v0, v7
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Integer);
a=0;//     iput v0, v1, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     iput v3, v1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     iput-object v8, v1, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     iput-boolean v2, v1, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     iput-object p0, v1, Landroid/support/v4/app/Fragment;->t:Landroid/support/v4/app/q;
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-boolean v2, v1, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     :goto_4
a=0;//     iget v0, p0, Landroid/support/v4/app/q;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_a
a=0;// 
a=0;//     iget-boolean v0, v1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/q;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v4=(Reference,Ujava/lang/Object;);v5=(Byte);
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not create a view."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Null);v2=(One);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Conflicted);
a=0;//     iget-boolean v1, v0, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ": Duplicate id 0x"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", tag "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", or parent id 0x"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " with another fragment for "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Boolean);v2=(One);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->q:Z
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/app/Fragment;->D:Z
a=0;// 
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/app/Fragment;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->G:Z
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/q;->a(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v7, :cond_c
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     :cond_c
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_d
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->J:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v1=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "FragmentManager{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, " in "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->q:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/c/d;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     :goto_0
a=0;//     const-string v1, "}}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/q;->o:Landroid/support/v4/app/m;
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/c/d;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
