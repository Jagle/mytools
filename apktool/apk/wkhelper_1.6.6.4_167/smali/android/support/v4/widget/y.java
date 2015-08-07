package android.support.v4.widget; class y { void a() { int a;
a=0;// .class public final Landroid/support/v4/widget/y;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final v:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field b:I
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:[F
a=0;// 
a=0;// .field e:[F
a=0;// 
a=0;// .field f:[F
a=0;// 
a=0;// .field g:[F
a=0;// 
a=0;// .field h:I
a=0;// 
a=0;// .field i:Landroid/view/VelocityTracker;
a=0;// 
a=0;// .field j:I
a=0;// 
a=0;// .field k:I
a=0;// 
a=0;// .field l:Landroid/view/View;
a=0;// 
a=0;// .field m:Z
a=0;// 
a=0;// .field private n:[I
a=0;// 
a=0;// .field private o:[I
a=0;// 
a=0;// .field private p:[I
a=0;// 
a=0;// .field private q:F
a=0;// 
a=0;// .field private r:F
a=0;// 
a=0;// .field private s:Landroid/support/v4/widget/o;
a=0;// 
a=0;// .field private final t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;// .field private final u:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private final w:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/z;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/z;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/z;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/z;);
a=0;//     sput-object v0, Landroid/support/v4/widget/y;->v:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(FFF)F
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpg-float v2, v1, p1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     move p2, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return p2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     cmpl-float v1, v1, p2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     cmpl-float v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     neg-float p2, p2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     move p2, p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(III)I
a=0;//     .locals 9
a=0;// 
a=0;//     const/high16 v8, 0x3f800000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v1, v0, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v2, v0
a=0;// 
a=0;//     invoke-static {v8, v0}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v3, 0x3f000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v0, v3
a=0;// 
a=0;//     float-to-double v4, v0
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     const-wide v6, 0x3fde28c7460698c7L
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     mul-double/2addr v4, v6
a=0;// 
a=0;//     double-to-float v0, v4
a=0;// 
a=0;//     float-to-double v4, v0
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     double-to-float v0, v4
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     add-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     const/high16 v2, 0x447a0000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     mul-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     const/16 v1, 0x258
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Float);v1=(Integer);v2=(Float);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, p3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     add-float/2addr v0, v8
a=0;// 
a=0;//     const/high16 v1, 0x43800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(F)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/y;->m:Z
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/support/v4/widget/aa;->a(Landroid/view/View;F)V
a=0;// 
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/y;->m:Z
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/widget/y;->b(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(FFI)V
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v2, p3, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v2, p3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     add-int/lit8 v3, p3, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v3, v3, [F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     add-int/lit8 v4, p3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-array v4, v4, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     add-int/lit8 v5, p3, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-array v5, v5, [F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     add-int/lit8 v6, p3, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v6, v6, [I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     add-int/lit8 v7, p3, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v7, v7, [I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v8, p3, 0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     new-array v8, v8, [I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v9=(Reference,[F);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v10=(Reference,[F);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v2, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     #v10=(Reference,[F);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v3, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     #v10=(Reference,[F);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v4, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     #v10=(Reference,[F);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v5, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v6, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v7, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/y;->p:[I
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/y;->p:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v0, v8, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v10=(Conflicted);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     iput-object v5, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     iput-object v6, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     iput-object v7, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     iput-object v8, p0, Landroid/support/v4/widget/y;->p:[I
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     aput p1, v3, p3
a=0;// 
a=0;//     aput p1, v2, p3
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     aput p2, v3, p3
a=0;// 
a=0;//     aput p2, v2, p3
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     float-to-int v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v5}, Landroid/view/ViewGroup;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/widget/y;->j:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     if-ge v3, v5, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v5}, Landroid/view/ViewGroup;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/widget/y;->j:I
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     if-ge v4, v5, :cond_4
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v5}, Landroid/view/ViewGroup;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/widget/y;->j:I
a=0;// 
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     if-le v3, v5, :cond_5
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     :cond_5
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v3}, Landroid/view/ViewGroup;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/widget/y;->j:I
a=0;// 
a=0;//     sub-int/2addr v3, v5
a=0;// 
a=0;//     if-le v4, v3, :cond_6
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     :cond_6
a=0;//     aput v0, v2, p3
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->h:I
a=0;// 
a=0;//     shl-int/2addr v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/y;->h:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,[F);v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     aput v2, v0, p1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     aput v2, v0, p1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->p:[I
a=0;// 
a=0;//     aput v2, v0, p1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     shl-int/2addr v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     xor-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/y;->h:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(FFII)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-ne v3, p4, :cond_0
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->k:I
a=0;// 
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->p:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-eq v3, p4, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-eq v3, p4, :cond_0
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_1
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);v3=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Float);v3=(Float);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     aget v2, v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v2, p4
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     cmpl-float v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/view/View;F)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/widget/aa;->c(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(Integer);v3=(Uninit);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static b(III)I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, p1, :cond_1
a=0;// 
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return p2
a=0;// 
a=0;//     :cond_1
a=0;//     if-le v0, p2, :cond_2
a=0;// 
a=0;//     if-gtz p0, :cond_0
a=0;// 
a=0;//     neg-int p2, p2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     move p2, p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(FFI)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/widget/y;->a(FFII)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p2, p1, p3, v1}, Landroid/support/v4/widget/y;->a(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v4/widget/y;->a(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     :cond_1
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p2, p1, p3, v1}, Landroid/support/v4/widget/y;->a(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aget v2, v1, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v2, v0
a=0;// 
a=0;//     aput v2, v1, p3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p3}, Landroid/support/v4/widget/aa;->a(II)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     iput p1, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/aa;->a(I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/widget/aa;->a(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/y;->a(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/view/View;II)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p1, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge p1, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lt p2, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge p2, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/view/MotionEvent;)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     aput v3, v5, v2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     aput v4, v3, v2
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iget v2, p0, Landroid/support/v4/widget/y;->q:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/y;->a(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->r:F
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/y;->q:F
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Landroid/support/v4/widget/y;->a(FFF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v2, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/view/y;->b(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Landroid/support/v4/widget/y;->r:F
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->q:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, v3}, Landroid/support/v4/widget/y;->a(FFF)F
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/y;->a(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(II)Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
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
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt p1, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge p1, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-lt p2, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge p2, v2, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->o:[I
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->p:[I
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/widget/y;->h:I
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/View;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/aa;->b(Landroid/view/View;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/y;->b(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(IIII)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v1, p1, v1
a=0;// 
a=0;//     sub-int v2, p2, v2
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/y;->b(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget v4, p0, Landroid/support/v4/widget/y;->r:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/widget/y;->q:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     invoke-static {p3, v4, v5}, Landroid/support/v4/widget/y;->b(III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/widget/y;->r:F
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/widget/y;->q:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     invoke-static {p4, v5, v6}, Landroid/support/v4/widget/y;->b(III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v6, v3}, Landroid/support/v4/widget/aa;->c(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v1, v4, v3}, Landroid/support/v4/widget/y;->a(III)I
a=0;// 
a=0;//     invoke-direct {p0, v2, v5, v0}, Landroid/support/v4/widget/y;->a(III)I
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/y;->b(I)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/MotionEvent;)Z
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_9
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(One);v3=(Integer);v4=(Reference,Landroid/view/VelocityTracker;);v5=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, v2, v3, v4}, Landroid/support/v4/widget/y;->a(FFI)V
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-ne v2, v3, :cond_3
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v6, :cond_3
a=0;// 
a=0;//     invoke-direct {p0, v2, v4}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     aget v2, v2, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->k:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/aa;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v2=(Integer);v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-direct {p0, v4, v3, v2}, Landroid/support/v4/widget/y;->a(FFI)V
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v2, v3, v2
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->k:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/aa;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     if-ne v5, v6, :cond_2
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v4, v3}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, v3, v2}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v3=(Integer);v5=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v3, v4, :cond_5
a=0;// 
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     aget v7, v7, v5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float v7, v2, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     aget v8, v8, v5
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-float v8, v6, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0, v2, v6}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     invoke-direct {p0, v6, v7}, Landroid/support/v4/widget/y;->a(Landroid/view/View;F)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_3
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     float-to-int v10, v7
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v10, v9
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v11, v6, v10}, Landroid/support/v4/widget/aa;->b(Landroid/view/View;I)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     invoke-virtual {v11, v6}, Landroid/support/v4/widget/aa;->d(Landroid/view/View;)I
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     invoke-virtual {v11, v6}, Landroid/support/v4/widget/aa;->c(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-eqz v11, :cond_5
a=0;// 
a=0;//     if-lez v11, :cond_7
a=0;// 
a=0;//     if-ne v10, v9, :cond_7
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/y;->c(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Integer);v6=(Reference,Landroid/view/View;);v7=(Float);v8=(Float);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Boolean);
a=0;//     invoke-direct {p0, v7, v8, v5}, Landroid/support/v4/widget/y;->b(FFI)V
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eq v7, v0, :cond_5
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     invoke-direct {p0, v6, v5}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     :cond_8
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v4=(Reference,Landroid/view/VelocityTracker;);v5=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/widget/y;->a(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/view/View;II)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     invoke-virtual {p0, p2, p3, v1, v1}, Landroid/support/v4/widget/y;->a(IIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->s:Landroid/support/v4/widget/o;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/o;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/o;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/support/v4/widget/aa;->a(Landroid/view/View;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/y;->b(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/view/MotionEvent;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->i:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Byte);v2=(Integer);v3=(Integer);v4=(Reference,Landroid/view/VelocityTracker;);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     float-to-int v3, v1
a=0;// 
a=0;//     float-to-int v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v1, v2, v0}, Landroid/support/v4/widget/y;->a(FFI)V
a=0;// 
a=0;//     invoke-direct {p0, v3, v0}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aget v0, v1, v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->k:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/aa;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v1=(Byte);v2=(Integer);v3=(Integer);v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {p0, v1, v2, v0}, Landroid/support/v4/widget/y;->a(FFI)V
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v1, v0}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->n:[I
a=0;// 
a=0;//     aget v0, v1, v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->k:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/aa;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Float);v2=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v3, v1, v2}, Landroid/support/v4/widget/y;->b(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v1, v0}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Null);v1=(Byte);v3=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v7, :cond_8
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->f:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     aget v2, v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->g:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     aget v2, v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float/2addr v0, v2
a=0;// 
a=0;//     float-to-int v2, v0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5, v6, v0}, Landroid/support/v4/widget/aa;->b(Landroid/view/View;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     sub-int v3, v0, v3
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v5}, Landroid/support/v4/widget/aa;->d(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/support/v4/widget/aa;->a(Landroid/view/View;I)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/y;->c(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Null);v1=(Integer);v2=(Integer);v4=(Reference,Landroid/view/VelocityTracker;);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v1, :cond_a
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->d:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     aget v5, v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float v5, v3, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/y;->e:[F
a=0;// 
a=0;//     #v6=(Reference,[F);
a=0;//     aget v6, v6, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float v6, v4, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-direct {p0, v5, v6, v2}, Landroid/support/v4/widget/y;->b(FFI)V
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v6, v7, :cond_a
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v3, v5}, Landroid/support/v4/widget/y;->a(Landroid/view/View;F)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     invoke-direct {p0, v3, v2}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     :cond_9
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/y;->c(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Null);v1=(Byte);v3=(Integer);v4=(Reference,Landroid/view/VelocityTracker;);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     if-ne v3, v7, :cond_b
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     if-ne v2, v3, :cond_b
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v3, :cond_f
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v4, v5, :cond_c
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0, v5, v6}, Landroid/support/v4/widget/y;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-ne v5, v6, :cond_c
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     invoke-direct {p0, v5, v4}, Landroid/support/v4/widget/y;->b(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->c:I
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/y;->d()V
a=0;// 
a=0;//     :cond_b
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/widget/y;->a(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_c
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Null);v4=(Reference,Landroid/view/VelocityTracker;);v5=(Uninit);v6=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v7, :cond_d
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/y;->d()V
a=0;// 
a=0;//     :cond_d
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v7, :cond_e
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/y;->a(F)V
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/y;->a()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_f
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_3
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_6
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final c()Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v7, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->s:Landroid/support/v4/widget/o;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/o;);
a=0;//     iget-object v1, v1, Landroid/support/v4/widget/o;->a:Landroid/support/v4/widget/p;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/support/v4/widget/p;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->s:Landroid/support/v4/widget/o;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/o;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/o;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/y;->s:Landroid/support/v4/widget/o;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/o;);
a=0;//     iget-object v3, v3, Landroid/support/v4/widget/o;->a:Landroid/support/v4/widget/p;
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/support/v4/widget/p;->b()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v4, v2, v4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int v5, v3, v5
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6, v4}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6, v5}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->t:Landroid/support/v4/widget/aa;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/aa;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/y;->l:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4, v5, v2}, Landroid/support/v4/widget/aa;->a(Landroid/view/View;I)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/y;->s:Landroid/support/v4/widget/o;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/o;);
a=0;//     iget-object v4, v4, Landroid/support/v4/widget/o;->a:Landroid/support/v4/widget/p;
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/support/v4/widget/p;->d()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->s:Landroid/support/v4/widget/o;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/o;);
a=0;//     iget-object v2, v2, Landroid/support/v4/widget/o;->a:Landroid/support/v4/widget/p;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/support/v4/widget/p;->e()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v3, v2, :cond_4
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/y;->u:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/y;->w:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/widget/y;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v7, :cond_6
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
