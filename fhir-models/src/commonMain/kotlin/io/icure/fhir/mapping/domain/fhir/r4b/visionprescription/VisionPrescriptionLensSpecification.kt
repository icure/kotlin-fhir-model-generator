//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.visionprescription

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Vision lens authorization
 *
 * Contain the details of  the individual lens specifications and serves as the authorization for
 * the fullfillment by certified professionals.
 *
 * @param id Unique id for inter-element referencing
 * @param product Product to be supplied
 * @param eye right | left
 * @param sphere Power of the lens
 * @param cylinder Lens power for astigmatism
 * @param axis Lens meridian which contain no power for astigmatism
 * @param add Added power for multifocal levels
 * @param power Contact lens power
 * @param backCurve Contact lens back curvature
 * @param diameter Contact lens diameter
 * @param duration Lens wear duration
 * @param color Color required
 * @param brand Brand required
 */
@SerialName("VisionPrescriptionLensSpecification")
@Serializable
public data class VisionPrescriptionLensSpecification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Product to be supplied
   */
  public val product: CodeableConcept,
  /**
   * right | left
   */
  public val eye: String? = null,
  /**
   * Power of the lens
   */
  public val sphere: Float? = null,
  /**
   * Lens power for astigmatism
   */
  public val cylinder: Float? = null,
  /**
   * Lens meridian which contain no power for astigmatism
   */
  public val axis: Int? = null,
  public val prism: List<VisionPrescriptionLensSpecificationPrism> = emptyList(),
  /**
   * Added power for multifocal levels
   */
  public val add: Float? = null,
  /**
   * Contact lens power
   */
  public val power: Float? = null,
  /**
   * Contact lens back curvature
   */
  public val backCurve: Float? = null,
  /**
   * Contact lens diameter
   */
  public val diameter: Float? = null,
  /**
   * Lens wear duration
   */
  public val duration: Quantity? = null,
  /**
   * Color required
   */
  public val color: String? = null,
  /**
   * Brand required
   */
  public val brand: String? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
