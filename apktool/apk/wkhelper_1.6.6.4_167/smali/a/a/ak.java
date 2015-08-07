package a.a; class ak { void a() { int a;
a=0;// .class public final enum La/a/ak;
a=0;// .super Ljava/lang/Enum;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final enum a:La/a/ak;
a=0;// 
a=0;// .field public static final enum b:La/a/ak;
a=0;// 
a=0;// .field private static final synthetic d:[La/a/ak;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final c:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-instance v0, La/a/ak;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/ak;);
a=0;//     const-string v1, "LEGIT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v3, v2}, La/a/ak;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,La/a/ak;);
a=0;//     sput-object v0, La/a/ak;->a:La/a/ak;
a=0;// 
a=0;//     new-instance v0, La/a/ak;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/ak;);
a=0;//     const-string v1, "ALIEN"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2, v4}, La/a/ak;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,La/a/ak;);
a=0;//     sput-object v0, La/a/ak;->b:La/a/ak;
a=0;// 
a=0;//     new-array v0, v4, [La/a/ak;
a=0;// 
a=0;//     sget-object v1, La/a/ak;->a:La/a/ak;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sget-object v1, La/a/ak;->b:La/a/ak;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sput-object v0, La/a/ak;->d:[La/a/ak;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #p0=(Reference,La/a/ak;);
a=0;//     iput p3, p0, La/a/ak;->c:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)La/a/ak;
a=0;//     .locals 1
a=0;// 
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,La/a/ak;);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, La/a/ak;->a:La/a/ak;
a=0;// 
a=0;//     #v0=(Reference,La/a/ak;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, La/a/ak;->b:La/a/ak;
a=0;// 
a=0;//     #v0=(Reference,La/a/ak;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)La/a/ak;
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, La/a/ak;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, La/a/ak;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[La/a/ak;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v0, La/a/ak;->d:[La/a/ak;
a=0;// 
a=0;//     #v0=(Reference,[La/a/ak;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [La/a/ak;
a=0;// 
a=0;//     #v2=(Reference,[La/a/ak;);
a=0;//     invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
}}
