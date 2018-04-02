<!DOCTYPE html>
<html>
<head>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, target-densityDpi=device-dpi, user-scalable=no" />
<title>OPUS MOBILE</title>

<link rel="stylesheet" type="text/css" href="css/OM.css">
<body>
	<!--Code Starts Here-->
	<div class="container">
		<div class="orangeText boldText padding10">Home Page: Product
			Management</div>
		<div class="headerBarblock">
			<div class="floatLeft boldText">&minus;</div>
			<div class="floatLeft paddingLeft10">Product Inventory</div>
			<div class="clear"></div>
		</div>
		<!-- Below class to show LEFT and Right border -->
		<div class="headercontentblock1">
			<div class="container1">
				<div class="floatLeft scanner"></div>
				<form method="post" action="/update">
					<!-- Code Starts Here-->
					<div class="container3">
						<div class="loginForm ">
							<div class="selectWidth95">
								<input name="itemId" id="itemId" type="text"
									class="inputboxBg" size="15" maxlength="15"
									value="${prEd.itemId}" placeholder="Item Id">
							</div>
							<div class="spacer1"></div>
							<div class="selectWidth95">
								<input name="productName" id="productName" type="text"
									class="inputboxBg" size="15" maxlength="15" value="${prEd.productName}"
									placeholder="Product Name">
							</div>
							<div class="spacer1"></div>
							<div class="selectWidth95">
								<input name="productDescription" id="productDescription"
									type="text" class="inputboxBg" size="15" maxlength="15"
									value="${prEd.productDescription}" placeholder="Product Description">
							</div>
							<div class="spacer1"></div>
							<div class="selectWidth95">
								<input name="productImage" id="productImage" type="text"
									class="inputboxBg" size="500" maxlength="500"
									value="${prEd.productImage}" placeholder="Product Image">
							</div>
							<div class="spacer1"></div>
							<div class="selectWidth95">
								<input name="price" id="price" type="text" class="inputboxBg"
									size="15" maxlength="15" value="${prEd.price}" placeholder="Price">
							</div>
							<div class="spacer1"></div>
							<div class="selectWidth95">
								<input name="quantity" id="quantity" type="text" class="inputboxBg"
									size="15" maxlength="15" value="${prEd.quantity}" placeholder="Quantity">
							</div>							
							<div class="selectWidth95">
								<input name="productId" id="productId" type="hidden" class="inputboxBg"
									size="15" maxlength="15" value="${prEd.productId}" placeholder="Quantity">
							</div>
							<div class="container alignCenter">
								<span class="floatLeft marginTop15"> <a href="#"
									title="Login Information">
										<button class="roundedButtoninfo" type="button" align="top">
										</button>
								</a>
								</span> <input class="loginButtonblue" id="" type="submit"
									value=" Update " />
							</div>
						</div>
					</div>
					<!-- Code Ends Here-->
				</form>
				<div class="clear"></div>
			</div>
		</div>
		<!-- End to show LEFT and Right border -->
		<!-- Below class to show Bottom border with LEFT and RIGHT rounded corners. -->
		<div class="headercontentblock0"></div>
		<!-- End to show Bottom border with LEFT and RIGHT rounded corners. -->
		<div class="spacer2"></div>
	</div>
	<!--Code Ends Here-->
</body>
</html>